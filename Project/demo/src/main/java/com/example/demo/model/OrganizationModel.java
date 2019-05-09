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

    //@NotNull
    private Long client_model_id;

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

    public Long getClient_model_id() {
        return client_model_id;
    }

    public void setClient_model_id(Long client_model_id) {
        this.client_model_id = client_model_id;
    }
}
