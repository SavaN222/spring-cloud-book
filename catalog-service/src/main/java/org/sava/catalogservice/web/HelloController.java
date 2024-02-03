package org.sava.catalogservice.web;

import org.sava.catalogservice.configuration.PolarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 3.2.24.
 */
@RestController
public class HelloController {
    private final PolarProperties polarProperties;

    public HelloController(PolarProperties polarProperties) {
        this.polarProperties = polarProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        return polarProperties.getGreeting();
    }
}
