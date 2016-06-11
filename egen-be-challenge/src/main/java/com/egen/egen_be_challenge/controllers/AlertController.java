package com.egen.egen_be_challenge.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egen.egen_be_challenge.entities.Alerts;
import com.egen.egen_be_challenge.utilities.MorphiaMongo;

@RestController
@RequestMapping("/alert")
public class AlertController {
	@RequestMapping(method = RequestMethod.GET, value = "/read", produces="application/json")
	public List<Alerts> read() {
		return new MorphiaMongo().readAlerts();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/readByTimeRange/{startTimeStamp}/{endTimeStamp}", produces="application/json")
	public Object read(@PathVariable long startTimeStamp, @PathVariable long endTimeStamp) {
		return new MorphiaMongo().readAlerts(startTimeStamp, endTimeStamp);
	}
}
