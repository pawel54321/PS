package com.example.demo.model;

//import lombok.Data;
//import lombok.Setter;
//import lombok.Getter;
//import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private Long id;
    private String client_name;
    private Long client_cost;

    @OneToMany ()
    @JoinColumn(name = "client_id") // nie musi byc taka sama nazwa jak w bazie
    private List<FridgeModel> FridgesModel;

    @OneToMany ()
    @JoinColumn(name = "client_id") // nie musi byc taka sama nazwa jak w bazie
    private List<UserModel> UsersModel;

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


}