package com.egen.egen_be_challenge.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.easyrules.api.RulesEngine;
import org.easyrules.core.RulesEngineBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egen.egen_be_challenge.easyrules.EasyRule1;
import com.egen.egen_be_challenge.easyrules.EasyRule2;
import com.egen.egen_be_challenge.entities.Metrics;
import com.egen.egen_be_challenge.utilities.MorphiaMongo;
import com.egen.egen_be_challenge.utilities.Sensor;

@RestController
@RequestMapping("/metric")
public class MetricController {
	private static Logger LOGGER = Logger.getLogger(MetricController.class);

	@RequestMapping(method = RequestMethod.POST, value = "/create", produces = "application/json")
	public void create(@RequestBody final Sensor sensor) {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		try {
			morphiaMongo.createMetrics(sensor.getTimeStamp(), sensor.getValue());
			RulesEngine rulesEngine = RulesEngineBuilder.aNewRulesEngine().withSkipOnFirstAppliedRule(true).build();
			rulesEngine.registerRule(new EasyRule1(new MorphiaMongo().getBaseValue(), sensor));
			rulesEngine.registerRule(new EasyRule2(new MorphiaMongo().getBaseValue(), sensor));
			rulesEngine.fireRules();
		} catch (Exception exception) {
			LOGGER.error(exception.getMessage());
		} finally {
			morphiaMongo.closeMongoClient();
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/read", produces = "application/json")
	public List<Metrics> read() {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		List<Metrics> metrics = null;
		try {
			metrics = morphiaMongo.readMetrics();
		} catch (Exception exception) {
			LOGGER.error(exception.getMessage());
		} finally {
			morphiaMongo.closeMongoClient();
		}
		return metrics;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/readByTimeRange/{startTimeStamp}/{endTimeStamp}", produces = "application/json")
	public List<Metrics> read(@PathVariable long startTimeStamp, @PathVariable long endTimeStamp) {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		List<Metrics> metrics = null;
		try {
			metrics = morphiaMongo.readMetrics(startTimeStamp, endTimeStamp);
		} catch (Exception exception) {
			LOGGER.error(exception.getMessage());
		} finally {
			morphiaMongo.closeMongoClient();
		}
		return metrics;
	}
}
