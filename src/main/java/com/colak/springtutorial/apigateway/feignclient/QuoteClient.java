package com.colak.springtutorial.apigateway.feignclient;

import com.colak.springtutorial.apigateway.config.MyFeignClientConfiguration;
import com.colak.springtutorial.quote.controller.QuoteResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.URI;

@FeignClient(name = "quoteClient", url = "https://this-is-a-placeholder.com" , configuration = MyFeignClientConfiguration.class)
public interface QuoteClient {

    @GetMapping(path = "/getQuote/{id}", produces = "application/json")
    ResponseEntity<QuoteResponse> getQuote(URI baseUrl, @PathVariable("id") int id);
}
