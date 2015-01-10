package org.nflcalc;

import org.nflcalc.Controller.Controller;
import org.nflcalc.Views.CalcFrame;

import javax.swing.*;

/**
 * Created by will on 06/01/15.
 */
public class Main {

    public static void main(final String[] args) {
        System.out.println("hello world");

        CalcFrame frame = new CalcFrame();

        final JPanel mainPanel = Controller.createMainPanel();
        frame.add(mainPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
