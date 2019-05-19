package com.example.demo;

import com.example.demo.model.ClientModel;
import com.example.demo.model.OrganizationModel;
import com.example.demo.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	OrganizationRepository organizationRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		List<ClientModel> list = new ArrayList<>();
//		ClientModel clientModel = new ClientModel();
//		clientModel.setClient_name("ss");
//		list.add(clientModel);
//		OrganizationModel organizationModel = new OrganizationModel();
//		organizationModel.setOrganization_name(" nazwa");
//		organizationModel.setClientModel(list);
//
//		organizationRepository.save(organizationModel);




	}
}
