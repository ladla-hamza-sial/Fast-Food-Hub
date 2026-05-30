package com.ladla.foodapp;

public class FoodItem {
    private String name;
    private String price;
    private String description;
    private int imageResource;

    public FoodItem(String name, String price, String description, int imageResource) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResource() {
        return imageResource;
    }
}
