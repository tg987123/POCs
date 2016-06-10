package com.egen.egen_be_challenge.entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("metrics")
public class Metrics {

	@Id
	private ObjectId id;

	private long timeStamp;

	private int value;

	public Metrics() {
	}

	public Metrics(long timeStamp, int value) {
		this.timeStamp = timeStamp;
		this.value = value;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}
	
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
		StringBuilder string = new StringBuilder();
		string.append('{');
		string.append("\n");
		string.append("\t").append("id:").append(this.id).append("\n");
		string.append("\t").append("timeStamp:").append(this.timeStamp).append("\n");
		string.append("\t").append("value:").append(this.value).append("\n");
		string.append('}');
		return string.toString();
	}
}
