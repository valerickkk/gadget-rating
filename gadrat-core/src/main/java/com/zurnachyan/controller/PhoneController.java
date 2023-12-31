package com.zurnachyan.controller;

import com.zurnachyan.entity.baseentity.gadgets.BasePhone;
import com.zurnachyan.service.PhoneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grbcknd")
@CrossOrigin("http://localhost:3000/")
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
