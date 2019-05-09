package com.example.demo.repository;

import com.example.demo.model.FridgeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FridgeRepository extends JpaRepository<FridgeModel,Long> {
}
