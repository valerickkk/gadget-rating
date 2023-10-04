package com.zurnachyan.controller;

import com.zurnachyan.entity.baseentity.gadgets.BaseHeadPhones;
import com.zurnachyan.service.HeadPhonesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grbcknd")
public class HeadPhonesController {

    private final HeadPhonesService service;

    public HeadPhonesController(HeadPhonesService service) {
        this.service = service;
    }

    @GetMapping("/headphones")
    public List<BaseHeadPhones> getAllPhones() {
        return service.getAll();
    }

    @GetMapping("/headphones/{id}")
    public BaseHeadPhones getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
