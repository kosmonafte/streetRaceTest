package org.example.model.car;

abstract public class Part {

    protected String name;
    protected double price;
    protected double wear;

    protected double power;

    public Part() {
        this.name = "_";
        this.price = 0;
        this.wear = 0;
        this.power = 0;
    }

    public Part(String name, double price, double wear, double power) {
        this.name = name;
        this.price = price;
        this.wear = wear;
        this.power = power;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double showPower() {
        return this.power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWear() {
        return wear;
    }

    public void setWear(double wear) {
        this.wear = wear;
    }

    public void changeWear(){
        this.wear += 0.01;
    }

    public double getPowerRace() {
        return this.power;
    }

    @Override
    public String toString() {
        return "Part{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", wear=" + wear +
                '}';
    }
}
