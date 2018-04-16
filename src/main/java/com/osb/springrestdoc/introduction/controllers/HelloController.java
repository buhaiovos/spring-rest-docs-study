package com.osb.springrestdoc.introduction.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{username}")
    public ResponseEntity<Map<String, String>> sayHelloToUser(@PathVariable("username") String userName) {
        Map<String, String> responsePayload = Collections.singletonMap("helloMessage", "Hello, " + userName + "!");

        return ResponseEntity.ok(responsePayload);
    }
}
