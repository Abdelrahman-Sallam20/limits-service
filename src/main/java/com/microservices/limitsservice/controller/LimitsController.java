package com.microservices.limitsservice.controller;

import com.microservices.limitsservice.bean.Limits;
import com.microservices.limitsservice.configuration.Configurations;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LimitsController {

    private Configurations configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//        return new Limits(1, 100);
    }
}
