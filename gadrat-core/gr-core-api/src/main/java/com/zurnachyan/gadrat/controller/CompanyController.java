package com.zurnachyan.gadrat.controller;

import com.zurnachyan.gadrat.entity.developers.BaseDeveloperCompany;
import com.zurnachyan.gadrat.service.DeveloperCompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/core/companies")
public class CompanyController {

    private final DeveloperCompanyService service;

    public CompanyController(DeveloperCompanyService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<BaseDeveloperCompany> getAllCompanies() {
        return service.getAll();
    }
}
