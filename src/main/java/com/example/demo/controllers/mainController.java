package com.example.demo.controllers;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.RequestModel;
import com.example.demo.models.ResponseModel;

@RestController
public class mainController {

    @PostMapping("/process")
    public ResponseModel processRequest(@RequestBody RequestModel request) {
        long responseTime = ThreadLocalRandom.current().nextLong(50, 100);
        ResponseModel response = new ResponseModel();
        response.setMessage("Request processed successfully!");
        response.setnameFromRequest(request.getName());
        response.setResponseTime(responseTime);
        try {
            Thread.sleep(responseTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return response;
    }
}
