package com.zurnachyan.controller;

import com.zurnachyan.entity.baseentity.gadgets.BasePhone;
import com.zurnachyan.service.PhoneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phones")
public class PhoneController {

    private final PhoneService service;

    public PhoneController(PhoneService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<BasePhone> getAllPhones() {
        return service.getAll();
    }

}
