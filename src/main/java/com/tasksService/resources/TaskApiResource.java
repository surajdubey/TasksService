package com.tasksService.resources;

import com.example.api.UserApi;
import com.example.model.GetUserDetailsResponse;
import com.tasksService.api.TaskApi;
import com.tasksService.business.TasksBusiness;
import com.tasksService.mode.TaskDetailResponse;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;

@Controller
public class TaskApiResource implements TaskApi {

    @Inject
    TasksBusiness tasksBusiness;

    @Override
    public TaskDetailResponse getTasks() {
        return tasksBusiness.getTasks();
    }
}
