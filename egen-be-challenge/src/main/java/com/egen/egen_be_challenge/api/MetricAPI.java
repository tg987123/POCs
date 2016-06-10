package com.egen.egen_be_challenge.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.egen.egen_be_challenge.entities.Metrics;

@Path("/metricAPI")
public interface MetricAPI {

	@PUT
	@Path("createMetrics")
	@Produces(MediaType.APPLICATION_XML)
	public void createMetrics(@QueryParam("timeStamp") long timeStamp, @QueryParam("value") int value);
	
	@GET
	@Path("readMetrics")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Metrics> readMetrics();

	@GET
	@Path("readMetricsByTimeStamp")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Metrics> readMetrics(@QueryParam("startTimeStamp") long startTimeStamp,
			@QueryParam("endTimeStamp") long endTimeStamp);
}