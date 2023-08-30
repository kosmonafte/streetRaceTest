package org.example.model.car;

public class Transmission {

    private String name;
    private int wear;
    private int power;

    public Transmission() {
        this.name = "Jatco";
        this.wear = 0;
        this.power = 50;
    }

    public Transmission(String name, int wear, int power) {
        this.name = name;
        this.wear = wear;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }

    public int racePower() {
        if (wear < 1) {
            return this.power;
        } else {
            return this.power / this.wear;
        }
    }
}
