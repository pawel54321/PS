package com.example.demo.model;

//import lombok.Data;
//import lombok.Setter;
//import lombok.Getter;
//import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

//@Data
//@Setter
//@Getter
//@NoArgsConstructor
@Entity
@Table(name = "client_model")

public class ClientModel {

   // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_model_id_seq")
   // @SequenceGenerator(name = "client_model_id_seq", sequenceName = "client_model_id_seq", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_model_id")
    private Long id;
    @Column(unique = true)
    private String client_name;

   // @NotNull
    //private Long organization_model_id;
    @ManyToOne
    @JoinColumn(name="organization_model_id" , nullable = false)
    private OrganizationModel organizationModel;

    private Long client_cost;

    //

    @OneToMany (mappedBy = "clientModel", cascade = CascadeType.ALL)
    private List<FridgeModel> fridgeModel;

    @OneToMany (mappedBy = "clientModel", cascade = CascadeType.ALL)
    private List<UserModel> userModel;

    public ClientModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public OrganizationModel getOrganizationModel() {
        return organizationModel;
    }

    public void setOrganizationModel(OrganizationModel organizationModel) {
        this.organizationModel = organizationModel;
    }

    public Long getClient_cost() {
        return client_cost;
    }

    public void setClient_cost(Long client_cost) {
        this.client_cost = client_cost;
    }

    public List<FridgeModel> getFridgeModel() {
        return fridgeModel;
    }

    public void setFridgeModel(List<FridgeModel> fridgeModel) {
        this.fridgeModel = fridgeModel;
    }

    public List<UserModel> getUserModel() {
        return userModel;
    }

    public void setUserModel(List<UserModel> userModel) {
        this.userModel = userModel;
    }
}