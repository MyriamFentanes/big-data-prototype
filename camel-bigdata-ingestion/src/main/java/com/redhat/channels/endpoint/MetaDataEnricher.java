package com.redhat.channels.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public interface MetaDataEnricher {
	
	@POST
	@Path(value="/")
	@Consumes(MediaType.APPLICATION_JSON) 
	@Produces(MediaType.APPLICATION_XML)
	public String kickStartProcess();

}
