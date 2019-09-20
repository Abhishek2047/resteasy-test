package com.re.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// when we want to make a class as resouce class then we should annotate it with @Path() annotation
// when we want to make a method as resource method then we should annotate it with http method designator annotation 
@Path("/test")
public class Test {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String performTest() {
		return "test successful  "+ this.hashCode();
	}

}
