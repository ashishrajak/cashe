package com.cashe.cashe.services;

import com.cashe.cashe.data.request.CheckSum;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Services {
    ObjectMapper objectMapper;
    RestTemplate restTemplate;
    @Autowired
    public ObjectMapper seObjectMapper(ObjectMapper objectMapper){
        return this.objectMapper=objectMapper;
    }
    @Autowired
    public  RestTemplate setRestTemplate(RestTemplate restTemplate){
        return this.restTemplate=restTemplate;
    }
    public  ResponseEntity<ObjectNode> checSum(CheckSum checkSum){
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<CheckSum> entity = new HttpEntity<>(checkSum, headers);
        String url="https://test-partners.cashe.co.in/partner/checkDuplicateCustomerLead";
       ResponseEntity<ObjectNode> objectNode=restTemplate.exchange(url, HttpMethod.POST,entity, ObjectNode.class);
        return objectNode;


    }
}
