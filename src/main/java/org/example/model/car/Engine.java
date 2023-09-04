package org.example.model.car;

public class Engine extends Part {
    private int power;

    public Engine() {
        super("21114", 20, 0);
        this.power = 90;
    }

    public Engine(String name, int price, double wear, int power) {
        super(name, price, wear);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public double getPowerRace() {
        double tmp = 0;
        if (this.wear < 0.01) {
            tmp = this.power;
        } else if (this.wear > 0.01 && this.wear < this.power - 1) {
            tmp = this.power - this.wear;
        } else {
            tmp = 1;
        }
        this.changeWear();
        return tmp;
    }

}
