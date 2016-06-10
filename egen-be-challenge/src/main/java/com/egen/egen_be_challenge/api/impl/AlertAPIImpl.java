package com.egen.egen_be_challenge.api.impl;

import java.util.List;

import com.egen.egen_be_challenge.api.AlertAPI;
import com.egen.egen_be_challenge.controllers.MorphiaMongo;
import com.egen.egen_be_challenge.entities.Alerts;

public class AlertAPIImpl implements AlertAPI {

	@Override
	public List<Alerts> readAlerts() {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		return morphiaMongo.readAlerts();
	}

	@Override
	public List<Alerts> readAlerts(long startTimeStamp, long endTimeStamp) {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		return morphiaMongo.readAlerts(startTimeStamp, endTimeStamp);
	}
}
