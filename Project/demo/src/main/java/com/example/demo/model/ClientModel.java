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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_model_id_seq")
   // @SequenceGenerator(name = "client_model_id_seq", sequenceName = "client_model_id_seq", allocationSize = 1)
    @Column(name="client_model_id")
    private Long id;
    private String client_name;

   // @NotNull
   @ManyToOne
   @JoinColumn(name = "user_model_id", nullable = false)
   private UserModel userModel;
    //private Long user_model_id;
   // @NotNull
   @ManyToOne
   @JoinColumn(name = "fridge_model_id", nullable = false)
   private FridgeModel fridgeModel;
    //private Long fridge_model_id;

    private Long client_cost;

    //

    @OneToMany(mappedBy = "clientModel", cascade = CascadeType.ALL)
    private List<OrganizationModel> organizationModel;

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

    public Long getClient_cost() {
        return client_cost;
    }

    public void setClient_cost(Long client_cost) {
        this.client_cost = client_cost;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public List<OrganizationModel> getOrganizationModel() {
        return organizationModel;
    }

    public void setOrganizationModel(List<OrganizationModel> organizationModel) {
        this.organizationModel = organizationModel;
    }

    public FridgeModel getFridgeModel() {
        return fridgeModel;
    }

    public void setFridgeModel(FridgeModel fridgeModel) {
        this.fridgeModel = fridgeModel;
    }
}