package com.example.demo.domain;

public class Order {
    private int id;
    private int customerId;
    private String orderDate;
    private String paymentOption;
    private String marking;
    private String experationDate;
    private String deliveryDate;
    private String deliveryTime;

    public Order(int id, int customerId, String orderDate, String paymentOption, String marking, String experationDate, String deliveryDate, String deliveryTime) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.paymentOption = paymentOption;
        this.marking = marking;
        this.experationDate = experationDate;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    public String getMarking() {
        return marking;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }

    public String getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(String experationDate) {
        this.experationDate = experationDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
