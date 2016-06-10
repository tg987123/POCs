package com.egen.egen_be_challenge.controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sensor {
	
	private long timestamp;
	private int weight;
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
    public String toString() {
        return "Sensor{" +
                "timestamp='" + timestamp + '\'' +
                ", weight=" + weight +
                '}';
    }
}
