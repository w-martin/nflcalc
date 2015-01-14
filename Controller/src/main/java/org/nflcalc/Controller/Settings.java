package org.nflcalc.Controller;

import java.io.File;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * Created by will on 14/01/15.
 */
public class Settings {

    private final Preferences preferences;

    private String yahooUsername, yahooPassword;

    public Settings() {
        preferences = Preferences.userRoot().node(this.getClass().getName());
    }

    public void loadPreferences() {
        yahooUsername = preferences.get("yahooUsername", "");
        yahooPassword = preferences.get("yahooPassword", "");
    }

    public String getYahooUsername() {
        return yahooUsername;
    }

    public String getYahooPassword() {
        return yahooPassword;
    }

    public static String getUserDataDirectory() {
        return System.getProperty("user.home") + File.separator + ".nflcalc" + File.separator;
    }
}
