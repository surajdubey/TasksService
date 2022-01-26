package com.example;

import com.example.resources.TaskApiResource;
import io.swagger.jaxrs.config.BeanConfig;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class TasksServiceApplication extends Application {

    public TasksServiceApplication() {

        System.out.println("calling constructor");
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:3000");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("com.example");
        beanConfig.setScan(true);
    }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(TaskApiResource.class);
        return resources;
    }
}
