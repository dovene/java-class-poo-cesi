package com.dov.cesi.builder;

public class Product {
    private  String id;
    private  String description;
    private  double price;
    private  String categoryDescription;
    private  String commercialName;

    private Product(ProductBuilder builder) {
        this.id = builder.id;
        this.description = builder.description;
        this.price = builder.price;
        this.categoryDescription = builder.categoryDescription;
        this.commercialName = builder.commercialName;
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

    public static class ProductBuilder
    {
        private  String id;
        private  String description;
        private  double price;
        private  String categoryDescription;
        private  String commercialName;

        public ProductBuilder(String id, String description) {
            this.id = id;
            this.description = description;
        }
        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }
        public ProductBuilder categoryDescription(String categoryDescription) {
            this.categoryDescription = categoryDescription;
            return this;
        }
        public ProductBuilder commercialName(String commercialName) {
            this.commercialName = commercialName;
            return this;
        }
        public Product build() {
            Product product =  new Product(this);
            return product;
        }
    }
}