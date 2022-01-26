package com.tasksService.business;

import com.example.api.UserApi;
import com.example.model.GetUserDetailsResponse;
import com.tasksService.mode.TaskDetailResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
@Slf4j
public class TasksBusiness {

    @Inject
    UserApi userApi;

    public TaskDetailResponse getTasks() {
        GetUserDetailsResponse response = userApi.getUser();
        System.out.println(response);
        return new TaskDetailResponse("123", "wake up");
    }

}
