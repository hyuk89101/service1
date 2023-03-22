package com.example.service1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ApiOneController {

    @GetMapping(value = "/reseller/main")
    public String services() {
        return String.format("reseller/main API Port : %s", "8011");
    }

    // message 메서드 추가
    @GetMapping("/reseller/message")
    public String message(@RequestHeader("first-request") String header) {
        log.info(header);
        return "Hello World in Service1.";
    }

}
