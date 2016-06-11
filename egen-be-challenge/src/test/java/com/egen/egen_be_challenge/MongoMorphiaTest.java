package com.egen.egen_be_challenge;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.egen.egen_be_challenge.entities.Alerts;
import com.egen.egen_be_challenge.entities.Metrics;
import com.egen.egen_be_challenge.utilities.MorphiaMongo;

public class MongoMorphiaTest {
	
	@Test
    public void insertAlertTest() {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		morphiaMongo.createAlert(System.currentTimeMillis(), "This is a alert4");
		assertTrue(true);
	}
	
	@Test
    public void insertMetricsTest() {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		morphiaMongo.createMetrics(System.currentTimeMillis(), 235);
		assertTrue(true);
	}
	
	@Test
    public void readAlertsTest() {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		morphiaMongo.readAlerts();
		for(Alerts alert : morphiaMongo.readAlerts())
			System.out.println(alert);
		assertTrue(true);
	}
	
	@Test
    public void readMetricsTest() {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		morphiaMongo.readMetrics();
		for(Metrics metrics : morphiaMongo.readMetrics())
			System.out.println(metrics);
		assertTrue(true);
	}
	
	@Test
    public void readAlertsByTimeStampTest() {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		morphiaMongo.readAlerts(1465507107553L, 1465507165928L);
		for(Alerts alert : morphiaMongo.readAlerts(1465507107553L, 1465507165928L))
			System.out.println(alert);
		assertTrue(true);
	}
	
	@Test
    public void readMetricsByTimeStampTest() {
		MorphiaMongo morphiaMongo = new MorphiaMongo();
		morphiaMongo.readMetrics(1465508277976L, 1465508311939L);
		for(Metrics metrics : morphiaMongo.readMetrics(1465508277976L, 1465508311939L))
			System.out.println(metrics);
		assertTrue(true);
	}
}
