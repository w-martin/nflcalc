package org.nflcalc.Controller;

import org.nflcalc.Model.Conference;
import org.nflcalc.Model.Division;
import org.nflcalc.Model.Team;
import org.nflcalc.Views.ConferencePanel;
import org.nflcalc.Views.RecordPanel;

import javax.swing.*;
import java.io.*;

/**
 * Created by will on 06/01/15.
 */
public class Controller {

    private static Controller instance = null;
    private final Settings settings;

    private Controller () {
        settings = new Settings();
        final File dataLocation = new File(Settings.getDefaultDataLocation());
        dataLocation.mkdirs();
        settings.saveSettings(Settings.getDefaultSettingsFileLocation());
    }

    public static synchronized Controller getInstance() {
        if (null == instance) {
            instance = new Controller();
        }
        return instance;
    }

    private Conference loadConference(final Conference.ConferenceType conferenceType) {
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

            bufferedReader.close();
            inputStreamReader.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return conference;
    }


    public JPanel startMainPanel() {
        final Conference nfc = loadConference(Conference.ConferenceType.NFC);
        final Conference afc = loadConference(Conference.ConferenceType.AFC);
        final RecordController recordController = new RecordController(afc, nfc);
        final ConferencePanel nfcPanel = new ConferencePanel(nfc);
        final ConferencePanel afcPanel = new ConferencePanel(afc);
        final RecordPanel recordPanel = new RecordPanel();

        recordController.setRecordPanel(recordPanel);

        final JPanel mainPanel = new JPanel();
        mainPanel.add(recordPanel);
        mainPanel.add(nfcPanel);
        mainPanel.add(afcPanel);

        return mainPanel;
    }
}
