package com.egen.egen_be_challenge.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.egen.egen_be_challenge.entities.Alerts;

@Path("/alertAPI")
public interface AlertAPI {

	@GET
	@Path("readAlerts")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alerts> readAlerts();

	@GET
	@Path("readAlertsByTimeStamp")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alerts> readAlerts(@QueryParam("startTimeStamp") long startTimeStamp,
			@QueryParam("endTimeStamp") long endTimeStamp);
}