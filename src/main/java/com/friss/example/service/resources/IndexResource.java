package com.friss.example.service.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;

@Path("/")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class IndexResource {

    @SuppressWarnings("unchecked")
	@GET
    public Response index(){
        JSONObject obj = new JSONObject();
        obj.put("status", "ok");
        obj.put("msg", "Service online");
      return Response.ok().entity(obj).type("application/json").build();
    }

}