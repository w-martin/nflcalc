package org.nflcalc.Views;

import org.nflcalc.Model.Team;

import javax.swing.*;
import java.awt.*;

/**
 * Created by will on 10/01/15.
 */
public class TeamPanel extends JPanel {

    public TeamPanel(final Team team) {
        final JLabel name = new JLabel(team.getId());
        this.add(name);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
