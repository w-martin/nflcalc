package org.nflcalc.Model;

/**
 * Created by will on 05/01/15.
 */
public class Team {

    private final String id;
    private int wins, losses, ties = 0;

    public Team(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }
}
