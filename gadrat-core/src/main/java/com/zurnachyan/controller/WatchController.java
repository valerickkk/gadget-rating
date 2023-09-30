package com.zurnachyan.controller;

import com.zurnachyan.entity.baseentity.gadgets.BaseWatch;
import com.zurnachyan.service.WatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/watches")
public class WatchController {

    private final WatchService service;

    public WatchController(WatchService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<BaseWatch> getAllPhones() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public BaseWatch getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
