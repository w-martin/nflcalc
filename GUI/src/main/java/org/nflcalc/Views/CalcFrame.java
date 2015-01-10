package org.nflcalc.Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by will on 06/01/15.
 */
public class CalcFrame extends JFrame {

    static {
        JFrame.setDefaultLookAndFeelDecorated(false);
    }

    public CalcFrame() {
        super("NFL Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        final JLabel emptyLabel = new JLabel("calculations here");
//        getContentPane().add(emptyLabel, BorderLayout.CENTER);

//        pack();
    }
}
