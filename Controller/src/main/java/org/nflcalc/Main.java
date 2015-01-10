package org.nflcalc;

import org.nflcalc.Controller.Controller;
import org.nflcalc.Model.Conference;
import org.nflcalc.Views.CalcFrame;
import org.nflcalc.Views.CalcPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by will on 06/01/15.
 */
public class Main {

    public static void main(final String[] args) {
        System.out.println("hello world");

        CalcFrame frame = new CalcFrame();

        final Conference nfc = Controller.loadConference(Conference.ConferenceType.NFC);
        CalcPanel nfcPanel = new CalcPanel(nfc);
        frame.getContentPane().add(nfcPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
