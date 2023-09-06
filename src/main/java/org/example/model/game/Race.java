package org.example.model.game;

import org.example.model.driver.Team;

public class Race {

    private Team[] teams;

    public Race() {
        teams = new Team[0];
    }

    public Race(Team[] teams) {
        this.teams = new Team[teams.length];
        for (int i = 0; i < teams.length; i++) {
            this.teams[i] = teams[i];
        }
    }

    public Team runRace() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < this.teams.length; i++) {
            if (this.teams[i].getPowerRace() > max) {
                max = teams[i].getPower();
                index = i;
            }
        }
        return this.teams[index];
    }
}
