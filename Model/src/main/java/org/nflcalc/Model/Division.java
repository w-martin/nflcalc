package org.nflcalc.Model;

import java.util.List;

/**
 * Created by will on 05/01/15.
 */
public class Division {

    private final List<Team> teams;

    public Division(final List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }
}
