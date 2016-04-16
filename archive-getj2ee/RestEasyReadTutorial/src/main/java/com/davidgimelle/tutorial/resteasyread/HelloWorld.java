package com.davidgimelle.tutorial.resteasyread;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author davidgimelle
 */
@Path("hello")
public class HelloWorld {

    @GET
    @Path("/{qui}")
    public Response echoService(@PathParam("qui") String message) {
        return Response.status(200).entity("hello "+message).build();
    }

}
