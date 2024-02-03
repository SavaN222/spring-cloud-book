package org.sava.catalogservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 3.2.24.
 */
@ConfigurationProperties(prefix = "polar")
public class PolarProperties {

    /**
     * Welcome message
     */
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
