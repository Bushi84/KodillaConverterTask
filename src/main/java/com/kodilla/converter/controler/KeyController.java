package com.kodilla.converter.controler;

import com.kodilla.converter.domain.MyKeyValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom/")
public class KeyController {

    @PostMapping(path = "add")
    public void acceptCustomTextType(@RequestBody MyKeyValue keyValueObj) {
        System.out.println("Key: " + keyValueObj.getKey());
        System.out.println("Value: " + keyValueObj.getValue());
    }
}
