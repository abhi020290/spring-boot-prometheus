package com.springboot.prometheus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
public class CustomResource {

    @RequestMapping("/counter")
    ResponseEntity<String> counter() {
        String test = "counter";
        MetricsComponent.testCounter.increment();
        return ResponseEntity.ok(test);
    }

    @RequestMapping("/hello")
    ResponseEntity<String> hello() {
        String test = "hello";
        MetricsComponent.testCounter.increment();
        return ResponseEntity.ok(test);
    }

}
