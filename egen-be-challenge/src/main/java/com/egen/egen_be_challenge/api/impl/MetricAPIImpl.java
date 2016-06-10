package com.egen.egen_be_challenge.api.impl;

import java.util.List;

import com.egen.egen_be_challenge.api.MetricAPI;
import com.egen.egen_be_challenge.controllers.MorphiaMongo;
import com.egen.egen_be_challenge.entities.Metrics;

public class MetricAPIImpl implements MetricAPI{

	@Override
	public void createMetrics(long timeStamp, int value) {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		morphiaMongo.insertMetrics(timeStamp, value);
	}

	@Override
	public List<Metrics> readMetrics() {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		return morphiaMongo.readMetrics();
	}

	@Override
	public List<Metrics> readMetrics(long startTimeStamp, long endTimeStamp) {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		return morphiaMongo.readMetrics(startTimeStamp, endTimeStamp);
	}

}
