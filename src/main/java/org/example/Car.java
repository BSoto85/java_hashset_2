package org.example; // Make sure this matches your package

import java.util.Objects; // For equals() and hashCode()

public class Car {
    String model;
    String make;

    public Car(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }
}