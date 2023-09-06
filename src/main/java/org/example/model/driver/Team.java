package org.example.model.driver;
import org.example.model.car.Car;


public class Team {

    private String name;
    private Car car;
    private Driver driver;

    public Team() {
        this.name = "RedBull";
        this.car = new Car();
        this.driver = new Driver();
    }

    public Team(String name ,Car car, Driver driver) {
        this.name = name;
        this.car = car;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return String.format("Команда: %s, водитель: %s, авто: %s (двигатель: %s, трансмисия: %s, шины: %s, TeamPower: %s)",
                this.name, driver.getName(), car.getName(), car.getEngine().getName(), car.getTransmission().getName(), car.getWheel().getName(), this.getPower());
    }

    public double getPower() {
        return car.getPower() + driver.getExperience();
    }

    public double getPowerRace() {
        double res;
        res = car.getPowerRace() + driver.getPowerRace();
        return res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
