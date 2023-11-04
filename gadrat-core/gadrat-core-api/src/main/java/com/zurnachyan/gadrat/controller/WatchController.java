package com.zurnachyan.gadrat.controller;

import com.zurnachyan.gadrat.entity.baseentity.gadgets.BaseWatch;
import com.zurnachyan.gadrat.service.WatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grbcknd")
public class WatchController {

    private final WatchService service;

    public WatchController(WatchService service) {
        this.service = service;
    }

    @GetMapping("/watches")
    public List<BaseWatch> getAllPhones() {
        return service.getAll();
    }

    @GetMapping("/watches/{id}")
    public BaseWatch getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
