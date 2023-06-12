package com.cashe.cashe.controllers;

import com.cashe.cashe.data.request.CheckSum;
import com.cashe.cashe.services.Services;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.management.ObjectName;

@RestController
public class Controller {
    ObjectMapper objectMapper;
    @Autowired
    private  ObjectMapper setObjectMapper(ObjectMapper objectMapper){
        return this.objectMapper=objectMapper;
    }
    private Services services;
    public  Services setServices(Services services){
        return this.services=services;
    }
    @PostMapping("/checksum")
    public ObjectNode checkSum(@RequestBody @Valid CheckSum checkSum){
        ResponseEntity<ObjectNode>  node=services.checSum(checkSum);
        return node.getBody();

    }
}
