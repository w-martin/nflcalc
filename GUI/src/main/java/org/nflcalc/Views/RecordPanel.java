package org.nflcalc.Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by will on 12/01/15.
 */
public class RecordPanel extends JPanel {

    private final JButton refreshButton;
    private final JButton[] weekButtons;

    public RecordPanel() {
        this.setLayout(new BorderLayout());

        refreshButton = new JButton("Refresh results");

        weekButtons = new JButton[17];
        final JPanel weekPanel = new JPanel();
        weekPanel.setLayout(new GridLayout(17, 1));
        for(int i = 1; i <= 17; i++) {
            final JButton button = new JButton("Week " + i);
            button.setEnabled(false);
            weekButtons[i - 1] = button;
            weekPanel.add(button);
        }
        this.add(refreshButton, BorderLayout.NORTH);
        this.add(weekPanel, BorderLayout.CENTER);
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }
}
