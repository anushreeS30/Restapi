package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Inventory;
import com.example.demo.repository.InventoryRepo;

@Service
public class InventoryService {
    @Autowired
    InventoryRepo inventoryRepo;
    public Inventory addInventory(Inventory inventory)
    {
        return inventoryRepo.save(inventory);
    }
    public List<Inventory> getInventory()
    {
        return inventoryRepo.findAll();
    }
    public Optional<Inventory> f2(Long id)
    {
        return inventoryRepo.findById(id);
    }
   
    public Inventory editInventory(Long id,Inventory inventory)
    {
        Inventory InventoryAvail=inventoryRepo.findById(id).orElse(null);
        if(InventoryAvail !=null)
        {
            InventoryAvail.setDate(inventory.getDate());
            InventoryAvail.setProduct(inventory.getProduct());
            InventoryAvail.setCategory(inventory.getCategory());
            InventoryAvail.setTodaysdelivery(inventory.getTodaysdelivery());
            InventoryAvail.setProductreturn(inventory.getProductreturn());
            InventoryAvail.setExchange(inventory.getExchange());
            InventoryAvail.setQuantity(inventory.getQuantity());
            return inventoryRepo.saveAndFlush(InventoryAvail);
        }
        else
        return null;
    }
    public String deleteInventory(Long id)
    {
      inventoryRepo.deleteById(id);  
      return("Successfully Deleted");
    }
}
