package org.nflcalc.Controller;

import org.nflcalc.Model.Conference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by will on 06/01/15.
 */
public class Controller {

    public enum ConferenceType {
        NFC, AFC;
    }

    public static Conference loadConference(final ConferenceType conferenceType) {
        final Conference conference = new Conference();

        String filename = (ConferenceType.NFC == conferenceType) ? "nfc" : "afc";
        filename = filename.concat(".csv");
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(filename);
        InputStreamReader inputStreamReader = new InputStreamReader(is);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return conference;
    }


}
