package org.nflcalc;

import org.nflcalc.Controller.Controller;
import org.nflcalc.Model.Conference;
import org.nflcalc.Views.CalcFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by will on 06/01/15.
 */
public class Main {

    public static void main(final String[] args) {
        System.out.println("hello world");

        CalcFrame frame = new CalcFrame();

        final Conference nfc = Controller.loadConference(Controller.ConferenceType.NFC);
//        CalcPanel nfcPanel =

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
