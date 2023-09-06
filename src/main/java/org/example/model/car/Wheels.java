package org.example.model.car;

public class Wheels extends Part{

    public Wheels() {
        super("Таганка", 10, 0, 30);
    }

    public Wheels(String name, double price, double wear, double power) {
        super(name, price, wear, power);
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public double getPowerRace() {
        double tmp = 0;
        if (this.wear <= 0.01) {
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
