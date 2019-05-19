package com.example.demo.service;

import com.example.demo.model.OrganizationModel;
import com.example.demo.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public List<OrganizationModel> getAllOrganizations() {

        return organizationRepository.findAll();
    }

    public OrganizationModel getOneOrganization(Long id) {

        return organizationRepository.findById(id).orElse(null);
    }

    public OrganizationModel insertNewOrganization(OrganizationModel organizationModel) {

        //organizationModel.getClientsModel().forEach(client -> client.setOrganizationModel(organizationModel));
        return organizationRepository.saveAndFlush(organizationModel);
    }

    @Transactional
    public OrganizationModel updateOrganizationById(Long id, OrganizationModel organizationModel) {
        OrganizationModel model = getOneOrganization(id);
        model.setOrganization_name(organizationModel.getOrganization_name());
        return model;
    }
}
