package com.zero.models;

public class commodity {
    private String id;
    private String name;
    private String price;
    private boolean status;
    private boolean cartStatus;

    public commodity() {
    }

    public commodity(String id, String name, String price, boolean status, boolean cartStatus) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.cartStatus = cartStatus;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(boolean cartStatus) {
        this.cartStatus = cartStatus;
    }
}
