package com.dov.cesi.builder;

public class Main {
    public static void main(String[] args) {
        Product productUn = new Product.ProductBuilder("KA456", "Gaucho")
                .price(30.0)
                .categoryDescription("No category")
                .commercialName("Niels")
                .build();
        System.out.println(productUn);

        Product productDeux = new Product.ProductBuilder("KZ890", "Roon")
                .build();
        System.out.println(productDeux);

        Product productTrois = new Product.ProductBuilder("KA457", "El Gaucho")
                .price(30.0)
                .build();
        System.out.println(productTrois);

    }
}
