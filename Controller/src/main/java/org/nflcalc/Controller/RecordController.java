package org.nflcalc.Controller;

import org.nflcalc.Model.Conference;
import org.nflcalc.Views.RecordPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by will on 12/01/15.
 */
public class RecordController {

    private final Conference[] conferences;
    private RecordPanel recordPanel;

    public RecordController(final Conference... conferences) {
        this.conferences = conferences;
    }

    public RecordPanel getRecordPanel() {
        return recordPanel;
    }

    private void refreshResults() {

    }

    public void setRecordPanel(RecordPanel recordPanel) {
        this.recordPanel = recordPanel;
        recordPanel.getRefreshButton().addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                refreshResults();
            }
        });
    }
}
