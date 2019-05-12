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
    @Column(name="user_model_id")
    private Long id;
    private String user_name;
    private Long user_cost;

    //

    @OneToMany(mappedBy = "userModel", cascade = CascadeType.ALL)
    private List<ClientModel> clientModel;

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
}
