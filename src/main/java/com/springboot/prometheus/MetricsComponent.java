package com.springboot.prometheus;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MetricsComponent {

    @Autowired
    private MeterRegistry meterRegistry;

    public static Counter testCounter;

    @PostConstruct
    public void init(){
        if(meterRegistry != null){
            testCounter = meterRegistry.counter("custom_counter");
        }
    }
}





