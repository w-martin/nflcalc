package org.nflcalc.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by will on 14/01/15.
 */
public class Settings {

    private String yahooUsername = "",
            yahooPassword = "";

    private final String property_yahooUsername = "yahooUsername",
            property_yahooPassword = "yahooPassword";

    public Settings() {
        loadSettings(Settings.getDefaultSettingsFileLocation());
    }

    public String getYahooUsername() {
        return yahooUsername;
    }

    public String getYahooPassword() {
        return yahooPassword;
    }

    public static String getDefaultDataLocation() {
        return System.getProperty("user.home") + File.separator + ".nflcalc" + File.separator;
    }

    public static String getDefaultSettingsFileLocation() {
        return Settings.getDefaultDataLocation() + "nflcalc.properties";
    }

    public void loadSettings(final String location) {
        FileInputStream fileInputStream = null;
        final File settingsFile = new File(location);
        if (settingsFile.exists()) {
            try {
                fileInputStream = new FileInputStream(settingsFile);
                final Properties properties = new Properties();
                properties.load(fileInputStream);

                yahooUsername = properties.getProperty(property_yahooUsername);
                yahooPassword = properties.getProperty(property_yahooPassword);

            } catch (final IOException ioe) {
                ioe.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                } catch (final IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    public void saveSettings(final String location) {
        FileOutputStream fileOutputStream = null;
        try {
            final File settingsFile = new File(location);
            settingsFile.createNewFile();
            fileOutputStream = new FileOutputStream(settingsFile);
            final Properties properties = new Properties();

            properties.put(property_yahooUsername, yahooUsername);
            properties.put(property_yahooPassword, yahooPassword);

            properties.store(fileOutputStream, "Automatic settings file.");
        } catch (final IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
