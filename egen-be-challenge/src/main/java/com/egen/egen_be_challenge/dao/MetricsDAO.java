package com.egen.egen_be_challenge.dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import com.egen.egen_be_challenge.entities.Metrics;
import com.mongodb.MongoClient;

public class MetricsDAO extends BasicDAO<Metrics, ObjectId>{

	public MetricsDAO(MongoClient mongoClient, Morphia morphia, String dbName) {
		super(mongoClient, morphia, dbName);
	}

}
