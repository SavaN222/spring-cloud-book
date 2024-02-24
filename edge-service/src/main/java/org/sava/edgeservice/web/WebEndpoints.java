package org.sava.catalogservice.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 16.2.24.
 */
@Configuration
public class WebEndpoints {
    @Bean
    public RouterFunction<ServerResponse> routerFunction() {
        return RouterFunctions.route()
                .GET("/catalog-fallback", request -> {
                    ServerResponse.ok().body(Mono)
                })
    }
}
