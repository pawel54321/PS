package com.example.demo.model;

//import lombok.Data;
//import lombok.Setter;
//import lombok.Getter;
//import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
    private Long id;
    private String client_name;

   // @NotNull
    private Long user_model_id;
   // @NotNull
    private Long fridge_model_id;

    private Long client_cost;

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

    public Long getUser_model_id() {
        return user_model_id;
    }

    public void setUser_model_id(Long user_model_id) {
        this.user_model_id = user_model_id;
    }

    public Long getFridge_model_id() {
        return fridge_model_id;
    }

    public void setFridge_model_id(Long fridge_model_id) {
        this.fridge_model_id = fridge_model_id;
    }

    public Long getClient_cost() {
        return client_cost;
    }

    public void setClient_cost(Long client_cost) {
        this.client_cost = client_cost;
    }
}