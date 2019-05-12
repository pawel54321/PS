package com.example.demo.model;

//import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

//@Data
@Entity
@Table(name = "organization_model")
public class OrganizationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String organization_name;

    @ManyToOne
    @JoinColumn(name = "client_model_id", nullable = false)
    private ClientModel clientModel;
    //@NotNull
    //private Long client_model_id;

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

    public ClientModel getClientModel() {
        return clientModel;
    }

    public void setClientModel(ClientModel clientModel) {
        this.clientModel = clientModel;
    }
}
