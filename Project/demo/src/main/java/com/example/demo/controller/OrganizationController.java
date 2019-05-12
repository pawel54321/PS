package com.example.demo.controller;

import com.example.demo.model.OrganizationModel;
import com.example.demo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organization")
public class OrganizationController {


    @Autowired
    private OrganizationService organizationService;

    @GetMapping("/")
    public List<OrganizationModel> getOrganizations() {
        return organizationService.getAllOrganizations();
    }

    @GetMapping("/{id}")
    public OrganizationModel getOrganizationByIndex(@PathVariable Long id) {
        return organizationService.getOneOrganization(id);
    }

    @PostMapping("/")
    public OrganizationModel insertNewOrganization(@RequestBody OrganizationModel organizationModel) {
        return organizationService.insertNewOrganization(organizationModel);
    }

    @PutMapping("/{id}")
    public OrganizationModel updateOrganization(@PathVariable Long id, @RequestBody OrganizationModel organizationModel) {
        return organizationService.updateOrganizationById(id, organizationModel);
    }

}