package com.henry.noticas.controller;

import com.henry.noticas.model.response.ApiWeatherResponse;
import com.henry.noticas.service.ApiCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequestMapping("/api")
@RestController
public class APICallController {

    @Autowired
    ApiCallService apiCallService;

    @GetMapping
    public Object callAPI(){
        try {
            ApiWeatherResponse apiWeatherResponse = apiCallService.callAPI();
            if (apiWeatherResponse.getLocation() == null){
                return apiCallService.callAPI2();
            }
            return apiWeatherResponse;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
