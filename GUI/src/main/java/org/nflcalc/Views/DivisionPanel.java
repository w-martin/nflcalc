package org.nflcalc.Views;

import org.nflcalc.Model.Division;
import org.nflcalc.Model.Team;

import javax.swing.*;
import java.awt.*;

/**
 * Created by will on 10/01/15.
 */
public class DivisionPanel extends JPanel {

    public DivisionPanel(final Division division) {
        this.setLayout(new BorderLayout());

        final JLabel name = new JLabel(division.getName());
        this.add(name, BorderLayout.WEST);

        final JPanel centrePanel = new JPanel();
        centrePanel.setLayout(new BoxLayout(centrePanel, BoxLayout.Y_AXIS));
        for(final Team team : division.getTeams()) {
            final TeamPanel teamPanel = new TeamPanel(team);
            centrePanel.add(teamPanel);
        }
        this.add(centrePanel, BorderLayout.CENTER);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
