package com.example.TazaaKhabar.service;

import com.example.TazaaKhabar.config.RestTemplateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class NewService {

    @Autowired
    RestTemplate restTemplate;

    public Object getNews(String country, String apikey) {

        String url = prepareUrl(country, apikey);

        return restTemplate.getForObject(url, Object.class);
    }

    private String prepareUrl(String country, String apiKey) {

        return "https://newsapi.org/v2/top-headlines?country=" + country +"&apiKey=" + apiKey;
    }
}
