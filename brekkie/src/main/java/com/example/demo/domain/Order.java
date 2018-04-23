package com.example.demo.domain;

public class Order {
    private int id;
    private int orderLines;
    private int customerId;
    private int sum;
    private String orderDate;
    private String paymentOption;
    private String marking;
    private String experationDate;
    private String deliveryDate;
    private String deliveryTime;

    public Order(int id, int orderLines, int customerId, int sum, String orderDate, String paymentOption, String marking, String experationDate, String deliveryDate, String deliveryTime) {
        this.id = id;
        this.orderLines = orderLines;
        this.customerId = customerId;
        this.sum = sum;
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

    public int getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(int orderLines) {
        this.orderLines = orderLines;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
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
