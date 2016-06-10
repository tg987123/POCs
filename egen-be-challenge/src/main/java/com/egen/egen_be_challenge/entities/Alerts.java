package com.egen.egen_be_challenge.entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("alerts")
public class Alerts {

	@Id
	private ObjectId id;

	private long timeStamp;

	private String alert;

	public Alerts() {
	}

	public Alerts(long timeStamp, String alert) {
		this.timeStamp = timeStamp;
		this.alert = alert;
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

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append('{');
		string.append("\n");
		string.append("\t").append("id:").append(this.id).append("\n");
		string.append("\t").append("timeStamp:").append(this.timeStamp).append("\n");
		string.append("\t").append("alert:").append(this.alert).append("\n");
		string.append('}');
		return string.toString();
	}
}
