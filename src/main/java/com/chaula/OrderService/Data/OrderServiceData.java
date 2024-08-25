package com.chaula.OrderService.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")
public class OrderServiceData {
    @Id
    private String order_id;
    private String username;
    private int cloth_id;
    private int quantity;
    private double total;
    public OrderServiceData() {
    }
    public String getOrder_id() {
        return order_id;
    }
    public void setOrder_id(String order_id) {
        this.order_id = order_id;
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
                "order_id=" + order_id +
                ", username='" + username + '\'' +
                ", cloth_id=" + cloth_id +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
