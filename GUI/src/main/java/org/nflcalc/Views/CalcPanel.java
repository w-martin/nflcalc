package org.nflcalc.Views;

import org.nflcalc.Model.Conference;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

/**
 * Created by will on 10/01/15.
 */
public class CalcPanel extends JPanel {

    private final Conference conference;

    public CalcPanel(final Conference conference) {
        this.conference = conference;

        final JLabel topLabel = new JLabel(conference.getType().getName());
        this.add(topLabel, BorderLayout.NORTH);

        String[] columnNames = {"Team"};
        Object[][] data = {
                {conference.getDivisions()[0].getName()},
                {conference.getDivisions()[1].getName()},
                {conference.getDivisions()[2].getName()},
                {conference.getDivisions()[3].getName()}
        };
        final JTable table = new JTable(data, columnNames);
        this.add(table, BorderLayout.CENTER);
    }


}
