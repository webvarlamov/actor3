package com.actor3.actor3.controller;

import com.actor3.actor3.entity.Attribute;
import com.actor3.actor3.entity.ClientUser;
import com.actor3.actor3.repository.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    AttributeRepository attributeRepository;

    @PostMapping("/test-create-attribute")
    public void testCreateAttribute(@RequestBody Attribute attribute) {
        attributeRepository.save(attribute);
    }


}
