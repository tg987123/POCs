package com.egen.egen_be_challenge.entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("metrics")
public class Metrics {

	@Id
	private ObjectId id;

	private long timestamp;

	private int weight;

	public Metrics() {
	}

	public Metrics(long timestamp, int weight) {
		this.timestamp = timestamp;
		this.weight = weight;
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append('{');
		string.append("\n");
		string.append("\t").append("id:").append(this.id).append("\n");
		string.append("\t").append("timestamp:").append(this.timestamp).append("\n");
		string.append("\t").append("weight:").append(this.weight).append("\n");
		string.append('}');
		return string.toString();
	}
}
