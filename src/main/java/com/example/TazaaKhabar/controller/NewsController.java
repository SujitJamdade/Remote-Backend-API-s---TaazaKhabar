package com.example.TazaaKhabar.controller;

import com.example.TazaaKhabar.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewService newService;

    @GetMapping("/get")
    public Object getNews(@RequestParam("country") String country, @RequestParam("apiKey") String apikey){

        return newService.getNews(country, apikey);
    }
}
