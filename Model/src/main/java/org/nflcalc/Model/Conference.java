package org.nflcalc.Model;

import java.util.List;

/**
 * Created by will on 05/01/15.
 */
public class Conference {

    final List<Division> divisions;

    public Conference(final List<Division> divisions) {
        this.divisions = divisions;
    }

    public List<Division> getDivisions() {
        return divisions;
    }
}
