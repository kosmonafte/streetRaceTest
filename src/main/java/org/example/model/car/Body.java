package org.example.model.car;

public class Body {

    private String name;
    private int mass;

    public Body() {
        this.name = "LaDa";
        this.mass = 1100;
    }

    public Body(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }


}
