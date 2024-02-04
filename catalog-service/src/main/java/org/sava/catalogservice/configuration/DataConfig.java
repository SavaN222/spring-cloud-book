package org.sava.catalogservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 4.2.24.
 */
@Configuration
@EnableJdbcAuditing // for jpa EnableJpaAuditing
public class DataConfig {
}
