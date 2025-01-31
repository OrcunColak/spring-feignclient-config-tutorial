package com.colak.springtutorial.apigateway.controller;

import com.colak.springtutorial.apigateway.service.QuoteService;
import com.colak.springtutorial.util.HttpServletRequestUtil;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/gateway")

@Slf4j
public class ApiGatewayController {

    private final QuoteService quoteService;


    // http://localhost:8080/api/gateway/getQuote/1
    @GetMapping(path = "getQuote/{id}")
    public String getQuote(@PathVariable("id") int id) {
        return quoteService.gather(id);
    }
}
