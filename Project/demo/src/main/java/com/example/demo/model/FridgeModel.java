package com.example.demo.model;

//import lombok.Data;

import javax.persistence.*;

//@Data
@Entity
@Table(name = "fridge_model")
public class FridgeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fridge_name;
    private Long fridge_cost;

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
}
