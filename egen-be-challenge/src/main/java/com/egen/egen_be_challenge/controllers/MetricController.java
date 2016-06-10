package com.egen.egen_be_challenge.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egen.egen_be_challenge.entities.Metrics;
import com.egen.egen_be_challenge.utilities.MorphiaMongo;
import com.egen.egen_be_challenge.utilities.Sensor;

@RestController
@RequestMapping("/metric")
public class MetricController {
	@RequestMapping(method = RequestMethod.POST, value = "/create")
    public void create(@RequestBody final Sensor sensor) {
        System.out.println(sensor.getValue());
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "/read", produces="application/json")
	public List<Metrics> read() {
		return new MorphiaMongo().readMetrics();
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "/readByTimeRange/{startTimeStamp}/{endTimeStamp}", produces="application/json")
    public List<Metrics> read(@PathVariable long startTimeStamp, @PathVariable long endTimeStamp) {
        return new MorphiaMongo().readMetrics(startTimeStamp, endTimeStamp);
    }
}