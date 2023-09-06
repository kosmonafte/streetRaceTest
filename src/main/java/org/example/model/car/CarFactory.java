package org.example.model.car;

import org.example.model.driver.Team;

public class CarFactory {
    static public Car getLadaVestaSport() {
        Engine lvsEng = new Engine("H4M", 2000, 0, 113);
        Transmission lvstrms = new Transmission("Jatco", 2500, 0, 70);
        Wheels lvswhls = new Wheels("Таганка", 300, 0, 30);
        Car lvs = new Car("Lada Vesta Sport", lvsEng, lvstrms, lvswhls);
        return lvs;
    }

    static public Car getLadaLargus() {
        Engine lvsEng = new Engine("21126", 1300, 0, 92);
        Transmission lvstrms = new Transmission("4matic", 1100, 0, 54);
        Wheels lvswhls = new Wheels("Nokian", 300, 0, 43);
        Car lvs = new Car("Lada Largus", lvsEng, lvstrms, lvswhls);
        return lvs;
    }

}
