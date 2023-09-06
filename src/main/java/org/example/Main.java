package org.example;
import org.example.model.car.Car;
import org.example.model.car.Engine;
import org.example.model.car.Transmission;
import org.example.model.car.Wheels;
import org.example.model.driver.Driver;
import org.example.model.driver.Team;
import org.example.model.game.Game;
import org.example.model.game.Race;

import java.net.CacheRequest;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}