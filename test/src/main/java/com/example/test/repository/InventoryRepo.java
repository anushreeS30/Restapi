package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory,Long>{
    
}
