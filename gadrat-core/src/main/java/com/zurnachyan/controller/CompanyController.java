package com.zurnachyan.controller;

import com.zurnachyan.entity.baseentity.developers.BaseDeveloperCompany;
import com.zurnachyan.service.DeveloperCompanyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grbcknd/companies")
@CrossOrigin("http://localhost:3000/")
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
