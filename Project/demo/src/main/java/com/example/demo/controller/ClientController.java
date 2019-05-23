package com.example.demo.controller;

import com.example.demo.model.OrganizationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.ClientService;
import com.example.demo.model.ClientModel;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public List<ClientModel> getClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public ClientModel getClientByIndex(@PathVariable Long id) {
        return clientService.getOneClient(id);
    }

    @PostMapping("/")
    public ClientModel insertNewClient(@RequestBody ClientModel clientModel){ //}, @RequestBody OrganizationModel organizationModel) {

      //  ClientModel client = new ClientModel();
      //  client.setOrganizationModel(clientModel.getOrganizationModel());
       // client.setClient_cost(clientModel.getClient_cost());
        //client.setClient_name(clientModel.getClient_name());


        return clientService.insertNewClient(clientModel);
    }

    @PutMapping("/{id}")
    public ClientModel updateClient(@PathVariable Long id, @RequestBody ClientModel clientModel) {
        return clientService.updateClientById(id, clientModel);
    }

}