package com.example.resources;

import com.example.api.TaskApi;
import com.example.mode.TaskDetailResponse;

public class TaskApiResource implements TaskApi {
    @Override
    public TaskDetailResponse getTasks() {
        return new TaskDetailResponse("123", "wake up");
    }
}
