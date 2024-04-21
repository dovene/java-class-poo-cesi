package com.dov.cesi.factory;

public class Main {
    public static void main(String[] args) {
        EngineFactory engineFactory = new EngineFactory();
        Engine car = engineFactory.createEngine(EngineFactory.ENGINE_TYPE.CAR);
        System.out.println(car.carburant());
        Engine bike = engineFactory.createEngine(EngineFactory.ENGINE_TYPE.BIKE);
        System.out.println(bike.carburant());
        Engine plane = engineFactory.createEngine(EngineFactory.ENGINE_TYPE.PLANE);
        System.out.println(plane.carburant());
    }
}
