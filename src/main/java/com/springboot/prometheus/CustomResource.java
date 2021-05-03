package com.springboot.prometheus;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
public class CustomResource {

  /*  @Autowired
    private MeterRegistry registry;

    private final Counter counterA = Counter.builder("first_counter").
            tag("first_counter", "This is sample counter").register(registry);


    private final Counter counterB = Counter.builder("second_counter").
            tag("second_counter", "This is sample second counter").register(registry);

    public CustomResource(MeterRegistry registry) {
        this.registry = registry;
    }*/

    @RequestMapping("/counter")
    ResponseEntity<String> counter() {
        String test = "counter";
       // counterA.increment();
        return ResponseEntity.ok(test);
    }

    @RequestMapping("/hello")
    ResponseEntity<String> hello() {
        String test = "hello";
     //   counterA.increment();
        return ResponseEntity.ok(test);
    }

}
