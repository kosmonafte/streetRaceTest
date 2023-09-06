package org.example.model.car;

public class Engine extends Part {

    public Engine() {
        super("21114", 20, 0, 90);
    }

    public Engine(String name, double price, double wear, double power) {
        super(name, price, wear, power);
    }

    public void setPower(double power) {
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
