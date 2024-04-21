package com.dov.cesi.builder.no_builder;

public class Main {
    public static void main(String[] args) {

        Product productUn = new Product("AK342","Gaucho");
        System.out.println(productUn);

        Product productDeux = new Product("AK3421","El Gaucho", 23.0, "liability", "record");
        System.out.println(productDeux);

        Product productTrois = new Product("AK3422","El el Gaucho",27.0, "game");
        System.out.println(productTrois);

    }
}
