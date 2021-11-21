package com.microservices.limitsservice.configuration;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("limits-service")
public class Configurations {

    private int minimum;
    private int maximum;

    public Configurations(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public Configurations() {
    }
}
