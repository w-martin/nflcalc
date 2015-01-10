package org.nflcalc.Views;

import org.nflcalc.Model.Conference;
import org.nflcalc.Model.Division;
import org.nflcalc.Model.Team;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

/**
 * Created by will on 10/01/15.
 */
public class ConferencePanel extends JPanel {

    private final Conference conference;

    public ConferencePanel(final Conference conference) {
        this.conference = conference;

        final JLabel topLabel = new JLabel(conference.getType().getName());
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        topLabel.setVerticalAlignment(JLabel.CENTER);

        this.setLayout(new BorderLayout());
        this.add(topLabel, BorderLayout.NORTH);

        final JPanel divisionsPanel = new JPanel();
        divisionsPanel.setLayout(new BoxLayout(divisionsPanel, BoxLayout.Y_AXIS));
        for (final Division division : conference.getDivisions()) {
            final DivisionPanel divisionPanel = new DivisionPanel(division);
            divisionsPanel.add(divisionPanel);
        }
        this.add(divisionsPanel, BorderLayout.CENTER);
    }


}
