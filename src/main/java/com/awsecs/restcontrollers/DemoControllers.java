package com.awsecs.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllers
{
    @GetMapping
    public String greeting()
    {
        return "Greeting method is started....";

    }

    @GetMapping("/{name}")
    public String getMessage(@PathVariable("name") String name)
    {
        return "Hi " + name + " Welcome to javatechie AWS ECS Example";
    }

}
