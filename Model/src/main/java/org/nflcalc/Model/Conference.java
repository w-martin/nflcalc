package org.nflcalc.Model;

import java.util.List;

/**
 * Created by will on 05/01/15.
 */
public class Conference {

    List<Division> divisions;

    public Conference() {
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(final List<Division> divisions) {
        this.divisions = divisions;
    }
}
