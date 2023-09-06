package org.example.model.game;

import org.example.model.car.*;
import org.example.model.driver.Driver;
import org.example.model.driver.Team;

public class Game {
    public void startGame() {
        Team[] teams = new Team[3];
        teams[0] = new Team("Нивас", CarFactory.getLadaLargus(), new Driver());
        teams[1] = new Team("RussiaTeams", CarFactory.getLadaVestaSport(), new Driver());
        teams[2] = new Team();
        Race race = new Race(teams);
        System.out.println("Победила " + race.runRace());
    }
}
