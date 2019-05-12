package com.example.demo.service;

import com.example.demo.model.FridgeModel;
import com.example.demo.repository.FridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FridgeService {

    @Autowired
    private FridgeRepository fridgeRepository;

    public List<FridgeModel> getAllFridges() {

        return fridgeRepository.findAll();
    }

    public FridgeModel getOneFridge(Long id) {

        return fridgeRepository.findById(id).orElse(null);
    }

    public FridgeModel insertNewFridge(FridgeModel fridgeModel) {
        return fridgeRepository.save(fridgeModel);
    }

    @Transactional
    public FridgeModel updateFridgeById(Long id, FridgeModel fridgeModel) {
        FridgeModel model = getOneFridge(id);
        model.setFridge_name(fridgeModel.getFridge_name());
        model.setFridge_cost(fridgeModel.getFridge_cost());
        return model;
    }
}
