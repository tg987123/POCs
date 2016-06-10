package com.egen.egen_be_challenge.entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("alerts")
public class Alerts {

	@Id
	private ObjectId id;

	private long timestamp;

	private String alert;

	public Alerts() {
	}

	public Alerts(long timestamp, String alert) {
		this.timestamp = timestamp;
		this.alert = alert;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
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
		string.append("\t").append("timestamp:").append(this.timestamp).append("\n");
		string.append("\t").append("alert:").append(this.alert).append("\n");
		string.append('}');
		return string.toString();
	}
}
