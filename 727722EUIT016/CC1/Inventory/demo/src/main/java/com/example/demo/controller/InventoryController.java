package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Inventory;
import com.example.demo.service.InventoryService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class InventoryController {
    @Autowired
    InventoryService inventoryService;
    @PostMapping("/inventory")
    public Inventory addInventory(@RequestBody Inventory inventory)
     {
      
        return inventoryService.addInventory(inventory);
    }
    @GetMapping("/inventory")
    public List<Inventory> getInventory()
    {
        return inventoryService.getInventory();
    }
    @GetMapping("/inventory/{id}")
    public Optional<Inventory> f2 (@PathVariable Long id) 
    {
        return inventoryService.f2(id);
    }
    @DeleteMapping("/inventory/{id}")
    public String  deleteInventory(@PathVariable Long id)
    {
        return inventoryService. deleteInventory(id);
    }
    @PutMapping("/inventory/{id}")
    public Inventory editInventory(@PathVariable Long id, @RequestBody Inventory inventory) 
    {
        return inventoryService.editInventory(id, inventory);
    
    }
    
    
    

    
}
