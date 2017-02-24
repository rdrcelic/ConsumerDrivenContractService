package com.example.config;

import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.exceptions.CdcErrorController;

/**
 * Test configurations
 *
 * @author rdrcelic
 * @since 24/02/17
 */
@Configuration
public class TestConfiguration {

    @Bean
    public CdcErrorController cdcErrorController(ErrorAttributes errorAttributes) {
        return new CdcErrorController(errorAttributes);
    }
}
