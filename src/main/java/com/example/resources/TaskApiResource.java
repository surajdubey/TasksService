package com.example.resources;

import com.example.api.TaskApi;
import com.example.api.UserApi;
import com.example.mode.TaskDetailResponse;
import com.example.model.GetUserDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;

@Controller
public class TaskApiResource implements TaskApi {

    @Inject
    UserApi userApi;

    @Override
    public TaskDetailResponse getTasks() {
        GetUserDetailsResponse response = userApi.getUser();
        System.out.println(response);
        return new TaskDetailResponse("123", "wake up");
    }
}
