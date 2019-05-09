package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


import com.example.demo.model.ClientModel;
import com.example.demo.repository.ClientRepository;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientModel> getAllClients() {

        return clientRepository.findAll();
    }

    public ClientModel getOneClient(Long id) {

        return clientRepository.findById(id).orElse(null);
    }

    public ClientModel insertNewClient(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    @Transactional
    public ClientModel updateClientById(Long id, ClientModel clientModel) {
        ClientModel model = getOneClient(id);
        model.setClient_name(clientModel.getClient_name());
        model.setClient_cost(clientModel.getClient_cost());
        return model;
    }
}
