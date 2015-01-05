package org.nflcalc.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by will on 05/01/15.
 */
public class Main {

    static {
        JFrame.setDefaultLookAndFeelDecorated(false);
    }

    public static void main(final String[] args) {
        System.out.println("hello world");

        final JFrame frame = new JFrame("NFL Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel emptyLabel = new JLabel("calculations here");
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
