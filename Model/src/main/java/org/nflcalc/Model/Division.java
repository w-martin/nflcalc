package org.nflcalc.Model;

import java.util.List;

/**
 * Created by will on 05/01/15.
 */
public class Division {

    private final String name;
    private Team[] teams;

    public Division(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }
}
