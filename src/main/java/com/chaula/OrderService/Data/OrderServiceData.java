package com.chaula.OrderService.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")
public class OrderServiceData {
    private String username;
    private int cloth_id;
    private int quantity;
    private double total;
    public OrderServiceData() {
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getCloth_id() {
        return cloth_id;
    }
    public void setCloth_id(int cloth_id) {
        this.cloth_id = cloth_id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderServiceData{" +
                "username='" + username + '\'' +
                ", cloth_id=" + cloth_id +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
