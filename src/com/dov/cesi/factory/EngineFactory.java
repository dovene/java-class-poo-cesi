package com.dov.cesi.factory;

public class EngineFactory {
    enum ENGINE_TYPE {CAR, BIKE, PLANE}

    public Engine createEngine(ENGINE_TYPE enginetype){
        switch (enginetype){
            case CAR : return new Car();
            case BIKE: return new Bike();
            case PLANE: return new Plane();
            default:
                throw new IllegalArgumentException("Type d'engin inconnu");
        }
    }
}
