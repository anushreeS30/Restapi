package com.example.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long r_id;
    String date;
    String category;
    String product;
    String productreturn;
    int exchange;
    int total;
    int quantity;
    String todaysdelivery;
    public long getId() {
        return r_id;
    }
    public void setId(long r_id) {
        this.r_id = r_id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public String getProductreturn() {
        return productreturn;
    }
    public void setProductreturn(String productreturn) {
        this.productreturn = productreturn;
    }
    public int getExchange() {
        return exchange;
    }
    public void setExchange(int exchange) {
        this.exchange = exchange;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getTodaysdelivery() {
        return todaysdelivery;
    }
    public void setTodaysdelivery(String todaysdelivery) {
        this.todaysdelivery = todaysdelivery;
    }
   
    
}
