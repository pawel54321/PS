package com.example.demo.model;

//import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

//@Data
@Entity
@Table(name = "organization_model")
public class OrganizationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organization_model_id")
    private Long id;
    @Column(unique = true)
    private String organization_name;

    //

    @OneToMany ()
    @JoinColumn(name = "organizationId")
    private List<ClientModel> clientsModel;

    public OrganizationModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    public List<ClientModel> getClientsModel() {
        return clientsModel;
    }

    public void setClientsModel(List<ClientModel> clientsModel) {
        this.clientsModel = clientsModel;
    }
}
