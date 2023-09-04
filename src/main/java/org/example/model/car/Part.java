package org.example.model.car;

abstract public class Part {

    protected String name;
    protected int price;
    protected double wear;

    public Part() {
        this.name = "Lada";
        this.price = 1500000;
        this.wear = 0;
    }

    public Part(String name, int price, double wear) {
        this.name = name;
        this.price = price;
        this.wear = wear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }

    public void changeWear(){
        this.wear += 0.01;
    }

    public double getPowerRace() {
        return this.wear;
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
