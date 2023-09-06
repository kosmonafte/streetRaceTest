package org.example.model.car;

import java.util.Arrays;

public class Car {

    private String name;
    Part[] parts;

    public Car() {
        this.name = "Жигули";
        parts = new Part[3];
        this.parts[0] = new Engine();
        this.parts[1] = new Transmission();
        this.parts[2] = new Wheels();
    }

    public Car(String name, Engine engine, Transmission transmission, Wheels wheel) {
        this.name = name;
        parts = new Part[3];
        this.parts[0] = engine;
        this.parts[1] = transmission;
        this.parts[2] = wheel;
    }

    public double getPower() {
        return this.parts[0].getPower() + this.parts[1].getPower() + this.parts[2].getPower();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Part getEngine() {
        return this.parts[0];
    }

    public void setEngine(Engine engine) {
        this.parts[0] = engine;
    }

    public Part getTransmission() {
        return this.parts[1];
    }

    public void setTransmission(Transmission transmission) {
        this.parts[1] = transmission;
    }

    public Part getWheel() {
        return this.parts[2];
    }

    public void setWheel(Wheels wheel) {
        this.parts[2] = wheel;
    }

    public double getPowerRace() {
        return this.parts[0].getPowerRace() + this.parts[1].getPowerRace() + this.parts[2].getPowerRace();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", parts=" + Arrays.toString(parts) +
                '}';
    }
}
