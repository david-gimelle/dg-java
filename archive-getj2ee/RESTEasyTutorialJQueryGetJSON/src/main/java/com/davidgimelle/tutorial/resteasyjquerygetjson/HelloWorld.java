package com.davidgimelle.tutorial.resteasyjquerygetjson;

import com.davidgimelle.tutorial.resteasyjquerygetjson.element.World;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author davidgimelle
 */
@Path("hello")
public class HelloWorld {

    @GET
    @Path("/{who}")
    public Response helloWorld(@PathParam("who") String message) {
        return Response.status(200).entity("hello "+message).build();
    }

    @GET
    @Path("/world/{message}")
    @Produces(MediaType.APPLICATION_JSON)
    public World helloWorldJSON(@PathParam("message") String message){
        World res=new World();
        res.setMessage(message);
        return res;
    }

}
