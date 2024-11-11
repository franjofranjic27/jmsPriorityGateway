package com.franjofranjic.jmsprioritygateway.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    DispatchService dispatchService;

    @PostMapping(value = "/send")
    public ResponseEntity<String> send(@RequestBody String message) {
        dispatchService.sendMessage(message);
        return new ResponseEntity<>("Message sent: " + message, HttpStatus.OK);
    }
}
