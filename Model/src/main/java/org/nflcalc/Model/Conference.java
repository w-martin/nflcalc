package org.nflcalc.Model;

import java.util.List;

/**
 * Created by will on 05/01/15.
 */
public class Conference {

    /**
     * NFC or AFC.
     */
    public enum ConferenceType {
        NFC("NFC"), AFC("AFC");

        private final String name;

        ConferenceType(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private final ConferenceType type;
    private Division[] divisions;

    public Conference(final ConferenceType type) {
        this.type = type;
    }

    public Division[] getDivisions() {
        return divisions;
    }

    public void setDivisions(Division[] divisions) {
        this.divisions = divisions;
    }

    public ConferenceType getType() {
        return type;
    }
}
