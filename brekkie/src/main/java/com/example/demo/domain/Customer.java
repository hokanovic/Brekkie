package com.example.demo.domain;

public class Customer {
    private int id;
    private String emai;
    private String orgId;
    private String adress;
    private String shippingAdress;
    private String contactInfo;
    private String name;


    public Customer(int id, String emai, String orgId, String adress, String shippingAdress, String contactInfo, String name) {
        this.id = id;
        this.emai = emai;
        this.orgId = orgId;
        this.adress = adress;
        this.shippingAdress = shippingAdress;
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
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
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
        return shippingAdress;
    }

    public void setShippingAdress(String shippingAdress) {
        this.shippingAdress = shippingAdress;
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
