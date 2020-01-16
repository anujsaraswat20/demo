package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getAllTrades() {
    	return "inside controller ->Info service executing in 3scale API Management";
    }

}
