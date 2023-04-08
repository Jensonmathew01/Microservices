package com.UST.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod(){
        return "hi user our service is taking a time please wait";
    }
    @GetMapping("/departmentuserServiceFallBackMethod")
    public String departmentuserServiceFallBackMethod(){
        return "hi user our service is taking a time please wait";
    }
}
