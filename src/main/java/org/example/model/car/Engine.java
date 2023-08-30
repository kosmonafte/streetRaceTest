package org.example.model.car;

public class Engine {

    private String name;
    private int power;
    private double wear;

    public Engine() {
        this.name = "21114";
        this.power = 90;
        this.wear = 0;
    }

    public Engine(String name, int power, int wear) {
        this.name = name;
        this.power = power;
        this.wear = wear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }

    public double racePower() {
        double tmp = 0;
        if (this.wear < 0.01) {
            tmp = this.power;
        } else if (this.wear > 0.01 && this.wear < this.power - 1) {
            tmp = this.power - this.wear;
        } else {
            tmp = 1;
        }
        wear += 0.01;
        return tmp;
    }
}
