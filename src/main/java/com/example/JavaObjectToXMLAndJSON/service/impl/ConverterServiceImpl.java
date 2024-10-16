package com.example.JavaObjectToXMLAndJSON.service.impl;


import com.example.JavaObjectToXMLAndJSON.service.ConverterService;
import com.example.JavaObjectToXMLAndJSON.util.ConverterUtil;
import org.springframework.stereotype.Service;

@Service
public class ConverterServiceImpl implements ConverterService {

    @Override
    public String convertToJson(Object object) {
        try {
            return ConverterUtil.convertToJson(object);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error converting to JSON";
        }
    }

    @Override
    public String convertToXml(Object object) {
        try {
            return ConverterUtil.convertToXml(object);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error converting to XML";
        }
    }
}