package com.final_project.orders_details;

public class OrderDetails {

    private int orderId;
    private int productId;
    private String productName;
    private int quantity;
    private float uniCost;
    private float subtotal;

    public OrderDetails() {
    }

    public OrderDetails(int orderId, int productId, String productName, int quantity, float uniCost, float subtotal) {
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.uniCost = uniCost;
        this.subtotal = subtotal;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUniCost() {
        return uniCost;
    }

    public void setUniCost(float uniCost) {
        this.uniCost = uniCost;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public  void calcPrice(){

    }
}
