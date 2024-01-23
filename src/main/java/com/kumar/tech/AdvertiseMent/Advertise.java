package com.kumar.tech.AdvertiseMent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Advertise {
    @GetMapping("/notice")
    public static String display(){
        return "Please contact me for advertisement";

    }
}
