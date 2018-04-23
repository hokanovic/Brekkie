package com.example.demo.domain;

public class Adress {
    private int id;
    private String adress;
    private int customer_id;

    public Adress(int id, String adress, int customer_id) {
        this.id = id;
        this.adress = adress;
        this.customer_id = customer_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
