package com.egen.egen_be_challenge.easyrules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.egen.egen_be_challenge.utilities.MorphiaMongo;
import com.egen.egen_be_challenge.utilities.Sensor;

@Rule(name = "Lower Bound Rule", description = "This rule will save alert if the person weight shoots by 10% of base weight.")
public class EasyRule1 {

	private int baseValue;
	private Sensor sensor;

	public EasyRule1() {
	}

	public EasyRule1(int baseValue, Sensor sensor) {
		this.baseValue = baseValue;
		this.sensor = sensor;
	}

	@Condition
	public boolean when() {
		// check if the person weight drops by 10%
		return sensor.getValue() < (0.9 * baseValue);
	}

	@Action
	public void then() throws Exception {
		new MorphiaMongo().createAlert(sensor.getTimeStamp(),
				"The weight of the person drops below 10% of his base weight");
	}
}