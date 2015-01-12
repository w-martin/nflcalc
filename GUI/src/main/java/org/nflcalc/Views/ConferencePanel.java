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

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        int d = 0;
        for (final Division division : conference.getDivisions()) {
            c.gridy = d;
            c.gridx = 0;
            final JLabel name = new JLabel(division.getName());
            Font font = name.getFont();
            Font boldFont = new Font(font.getFontName(), Font.BOLD, font.getSize());
            name.setFont(boldFont);

            this.add(name, c);
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridheight = 1;
            c.ipadx = 10;
            c.gridx += 3;
            addLabel("W",c);
            c.gridx += 1;
            addLabel("L", c);
            c.gridx += 1;
            addLabel("T", c);

            for(final Team team : division.getTeams()) {
                c.gridx = 0;
                c.gridy += 1;
                c.gridwidth = 3;
                addLabel(team.getId(), c);
                c.gridwidth = 1;
                c.gridx += 3;
                addLabel("0", c);;
                c.gridx += 1;
                addLabel("0", c);;
                c.gridx += 1;
                addLabel("0", c);;
            }

            d += 5;
        }
    }

    private void addLabel(String text, final GridBagConstraints c) {
        final JLabel name = new JLabel(text);
        name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(name, c);
    }
}
