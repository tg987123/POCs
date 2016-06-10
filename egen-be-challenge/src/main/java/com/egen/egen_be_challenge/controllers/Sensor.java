package com.egen.egen_be_challenge.controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sensor {
	
	private long timeStamp;
	private int value;
	
	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
    public String toString() {
        return "Sensor{" +
                "timeStamp='" + timeStamp + '\'' +
                ", value=" + value +
                '}';
    }
}
