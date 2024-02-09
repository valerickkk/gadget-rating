package com.zurnachyan.gadrat.controller;

import com.zurnachyan.gadrat.entity.gadget.BasePhone;
import com.zurnachyan.gadrat.service.PhoneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/core")
public class PhoneController {

    private final PhoneService service;

    public PhoneController(PhoneService service) {
        this.service = service;
    }

    @GetMapping("/phones")
    public List<BasePhone> getAllPhones() {
        return service.getAll();
    }

    @GetMapping("/phones/{id}")
    public BasePhone getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
