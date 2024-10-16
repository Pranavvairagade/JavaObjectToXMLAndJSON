package com.example.JavaObjectToXMLAndJSON.service;

public interface ConverterService {
    String convertToJson(Object object);
    String convertToXml(Object object);
}