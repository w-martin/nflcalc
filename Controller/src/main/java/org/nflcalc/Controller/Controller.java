package org.nflcalc.Controller;

import org.nflcalc.Model.Conference;
import org.nflcalc.Model.Division;
import org.nflcalc.Model.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by will on 06/01/15.
 */
public class Controller {

    public static Conference loadConference(final Conference.ConferenceType conferenceType) {
        final Conference conference = new Conference(conferenceType);

        String filename = conferenceType.getName().concat(".csv");
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(filename);
        InputStreamReader inputStreamReader = new InputStreamReader(is);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        try {
            Division[] divisions = new Division[4];
            for (int d = 0; d < 4; d++) {
                line = bufferedReader.readLine();
                String[] tokens = line.split(",");
                final Division division = new Division(conferenceType.getName() + " " + tokens[0]);
                Team[] teams = new Team[4];
                for (int i = 0; i < 4; i++) {
                    final Team team = new Team(tokens[i + 1]);
                    teams[i] = team;
                }
                division.setTeams(teams);
                divisions[d] = division;
            }
            conference.setDivisions(divisions);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return conference;
    }


}
