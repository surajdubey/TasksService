package com.tasksService.resources;

import com.tasksService.api.TaskApi;
import com.tasksService.mode.TaskDetailResponse;
import org.springframework.stereotype.Controller;

@Controller
public class TaskApiResource implements TaskApi {

/*
    @Inject
    UserApi userApi;
*/

    @Override
    public TaskDetailResponse getTasks() {
//        GetUserDetailsResponse response = userApi.getUser();
//        System.out.println(response);
        return new TaskDetailResponse("123", "wake up");
    }
}
