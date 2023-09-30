package com.zurnachyan.controller;

import com.zurnachyan.entity.baseentity.gadgets.BaseHeadPhones;
import com.zurnachyan.service.HeadPhonesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/headphones")
public class HeadPhonesController {

    private final HeadPhonesService service;

    public HeadPhonesController(HeadPhonesService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<BaseHeadPhones> getAllPhones() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public BaseHeadPhones getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
