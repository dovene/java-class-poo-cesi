package com.dov.cesi.builder.no_builder;

public class Product {
    private  String id;
    private  String description;
    private  double price;
    private  String categoryDescription;
    private  String commercialName;


    public Product(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Product(String id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }


    public Product(String id, String description, double price, String categoryDescription) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.categoryDescription = categoryDescription;
    }

    public Product(String id, String description, double price, String categoryDescription, String commercialName) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.categoryDescription = categoryDescription;
        this.commercialName = commercialName;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public String getCommercialName() {
        return commercialName;
    }

    @Override
    public String toString() {
        return "Product: "+this.id+", "+this.description+", "+this.price+", "+this.categoryDescription+", "+this.commercialName;
    }


}