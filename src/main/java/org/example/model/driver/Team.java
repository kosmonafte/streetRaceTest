package org.example.model.driver;
import org.example.model.car.Car;


public class Team {
    private Car car;
    private Driver driver;

    public Team() {
        this.car = new Car();
        this.driver = new Driver();
    }

    public Team(Car car, Driver driver) {
        this.car = car;
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
