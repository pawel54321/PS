package com.example.demo.controller;

import com.example.demo.model.FridgeModel;
import com.example.demo.service.FridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fridge")
public class FridgeController {

    @Autowired
    private FridgeService fridgeService;

    @GetMapping("/")
    public List<FridgeModel> getFridges() {
        return fridgeService.getAllFridges();
    }

    @GetMapping("/{id}")
    public FridgeModel getFridgeByIndex(@PathVariable Long id) {
        return fridgeService.getOneFridge(id);
    }

    @PostMapping("/")
    public FridgeModel insertNewFridge(@RequestBody FridgeModel fridgeModel) {
        return fridgeService.insertNewFridge(fridgeModel);
    }

    @PutMapping("/{id}")
    public FridgeModel updateFridge(@PathVariable Long id, @RequestBody FridgeModel fridgeModel) {
        return fridgeService.updateFridgeById(id, fridgeModel);
    }
}
