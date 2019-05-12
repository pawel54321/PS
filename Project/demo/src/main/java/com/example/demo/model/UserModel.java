package com.example.demo.model;

//import lombok.Data;

import javax.persistence.*;
import java.util.List;

//@Data
@Entity
@Table(name = "user_model")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String user_name;
    private Long user_cost;

    @ManyToOne
    @JoinColumn(name="client_model_id" , nullable = false)
    private ClientModel clientModel;
    //private Long client_model_id;

    public UserModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Long getUser_cost() {
        return user_cost;
    }

    public void setUser_cost(Long user_cost) {
        this.user_cost = user_cost;
    }

    public ClientModel getClientModel() {
        return clientModel;
    }

    public void setClientModel(ClientModel clientModel) {
        this.clientModel = clientModel;
    }
}
