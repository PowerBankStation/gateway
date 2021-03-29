package com.bank.gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Controller {



    @GetMapping("/reserv")
    public String reserve(@RequestParam String username){
        System.out.println("PAYMENT_GATEWAY: "+username+" reserverd");
//        ResponseEntity<String> responseEntity = new ResponseEntity<String>("success", HttpStatus.OK);
        String responseEntity = "success";

        return responseEntity;
    }
}
