package com.example.demo.domain;

public class Customer {
    private int id;
    private String email;
    private String orgId;
    private String adress;
    private String deliveryAdress;
    private String contactInfo;
    private String name;


    public Customer(int id, String email, String orgId, String adress, String deliveryAdress, String contactInfo, String name) {
        this.id = id;
        this.email = email;
        this.orgId = orgId;
        this.adress = adress;
        this.deliveryAdress = deliveryAdress;
        this.contactInfo = contactInfo;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmai() {
        return email;
    }

    public void setEmai(String email) {
        this.email = email;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getShippingAdress() {
        return deliveryAdress;
    }

    public void setShippingAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
