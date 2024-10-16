package com.example.JavaObjectToXMLAndJSON.controller;

import com.example.JavaObjectToXMLAndJSON.model.Person;
import com.example.JavaObjectToXMLAndJSON.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class ConverterController {

    @Autowired
    private ConverterService converterService;

    @GetMapping("/json")
    public String convertToJson() {
        Person person = new Person("this is json file ", 30);
        return converterService.convertToJson(person);
    }

    @GetMapping("/xml")
    public String convertToXml() {
        Person person = new Person("this is xml file", 30);
        return converterService.convertToXml(person);
    }
}