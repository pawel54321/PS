package com.example.demo.model;

//import lombok.Data;

import javax.persistence.*;
import java.util.List;

//@Data
@Entity
@Table(name = "fridge_model")
public class FridgeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String fridge_name;
    private Long fridge_cost;

    @ManyToOne
    @JoinColumn(name="client_model_id" , nullable = false)
    private ClientModel clientModel;
    //private Long client_model_id;


    public FridgeModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFridge_name() {
        return fridge_name;
    }

    public void setFridge_name(String fridge_name) {
        this.fridge_name = fridge_name;
    }

    public Long getFridge_cost() {
        return fridge_cost;
    }

    public void setFridge_cost(Long fridge_cost) {
        this.fridge_cost = fridge_cost;
    }

    public ClientModel getClientModel() {
        return clientModel;
    }

    public void setClientModel(ClientModel clientModel) {
        this.clientModel = clientModel;
    }
}
