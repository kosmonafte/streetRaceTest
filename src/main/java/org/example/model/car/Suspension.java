package org.example.model.car;

public class Suspension {

    private String name;
    private int power;
    private int wear;

    public Suspension() {
        this.name = "SS20";
        this.power = 50;
        this.wear = 0;
    }

    public Suspension(String name, int power, int wear) {
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

    public int getHard() {
        return power;
    }

    public void setHard(int hard) {
        this.power = hard;
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
