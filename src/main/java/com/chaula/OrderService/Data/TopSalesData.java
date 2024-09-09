package com.chaula.OrderService.Data;


import com.fasterxml.jackson.annotation.JsonProperty;

public class TopSalesData {
    @JsonProperty("clothe_id")
    private int _id;

    @JsonProperty("quantity")
    private int totalQuantity;

    public int get_id() {
        return _id;
    }
    public void set_id(int _id) {
        this._id = _id;
    }
    public int getTotalQuantity() {
        return totalQuantity;
    }
    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}

