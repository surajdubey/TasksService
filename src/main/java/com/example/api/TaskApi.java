package com.example.api;

import com.example.mode.TaskDetailResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/task")
@Api(value = "Tasks API")
public interface TaskApi {
    @GET
    @Path("/")
    @ApiOperation(value = "Get Tasks Lists")
    @Produces(MediaType.APPLICATION_JSON)
    TaskDetailResponse getTasks();
}
