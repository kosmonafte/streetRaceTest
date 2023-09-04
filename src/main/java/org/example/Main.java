package org.example;
import org.example.model.car.Car;
import org.example.model.car.Engine;
import org.example.model.car.Transmission;
import org.example.model.car.Wheels;

import java.net.CacheRequest;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        System.out.println(car.getPowerRace());
        System.out.println(car);
        Car car1 = new Car("Нивас", new Engine("21218", 10, 0.05, 100), new Transmission(), new Wheels());
        System.out.println(car1);
        System.out.println(car1.getPowerRace());
        System.out.println(car1);
    }
}