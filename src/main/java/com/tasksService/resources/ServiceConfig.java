package com.tasksService.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.jaxrs.config.BeanConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan({
        "com.example.api",
        "com.example.resources"
})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ServiceConfig {

    @Bean
    public ObjectMapper objectMapper() {
        System.out.println("objectMapper() is called");
        return new ObjectMapper();
    }

    @PostConstruct
    public void beanConfig() {
        System.out.println("postConstruct on serviceconfig");

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:4000");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("com.tasksService");
        beanConfig.setScan(true);
    }

}
