package com.example.demo.repository;

import com.example.demo.model.OrganizationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<OrganizationModel, Long> {
}
