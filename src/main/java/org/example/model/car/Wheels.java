package org.example.model.car;

public class Wheels {

    private String name;
    private int power;
    private int wear;

    public Wheels() {
        this.name = "Таганка";
        this.power = 1;
        this.wear = 0;
    }

    public Wheels(String name, int clutch, int wear) {
        this.name = name;
        this.power = clutch;
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

    public int racePower() {
        if (wear < 1) {
            return this.power;
        } else {
            return this.power / this.wear;
        }
    }

}
