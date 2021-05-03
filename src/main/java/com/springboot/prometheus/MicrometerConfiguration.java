package com.springboot.prometheus;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class MicrometerConfiguration {

   /* @Bean
    MeterRegistryCustomizer<MeterRegistry> meterRegistryCustomizer() {
        return (registry) -> registry.config().commonTags("application", "spring-boot-prometheus");
    }*/

}
