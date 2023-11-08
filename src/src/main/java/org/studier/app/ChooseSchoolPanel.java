package org.studier.app;

import org.studier.canvas.CanvasAccesser;
import org.studier.schools.School;
import org.studier.schools.SchoolManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A panel for choosing a school.
 *
 * @author Patrick Carroll
 * @version November 7th, 2023
 */
public class ChooseSchoolPanel extends JPanel implements ActionListener {

    /**
     * Accesses the canvas page.
     */
    private CanvasAccesser canvasAccesser;

    /**
     * A button for choosing a school.
     */
    private JButton chooseSchoolButton;

    /**
     * A list containing schools.
     */
    private DefaultListModel<School> list;

    /**
     * A list element containing schools.
     */
    private JList<School> listElement;

    /**
     * Constructs a new choose school panel to choose a school.
     *
     * @param canvasAccesser Accesses the canvas page.
     */
    public ChooseSchoolPanel(CanvasAccesser canvasAccesser) {

        this.canvasAccesser = canvasAccesser;

        this.setLayout(null);
        this.setSize(new Dimension(ControlWindow.WIDTH, ControlWindow.HEIGHT));
        this.setPreferredSize(new Dimension(ControlWindow.WIDTH, ControlWindow.HEIGHT));

        JLabel label1 = new JLabel("Choose your school:");
        label1.setBounds(50, 10, 600, 30);

        chooseSchoolButton = new JButton("Choose");
        chooseSchoolButton.setBounds(60, 240, 480, 30);
        chooseSchoolButton.addActionListener(this);

        list = new DefaultListModel();
        listElement = new JList(list);
        listElement.setBounds(60, 40, 480, 200);
        listElement.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listElement.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        listElement.setVisibleRowCount(-1);

        JScrollPane listScroller = new JScrollPane(listElement);
        listScroller.setPreferredSize(new Dimension(250, 80));

        for (School school: SchoolManager.getSchools())
            list.addElement(school);

        this.add(label1);
        this.add(chooseSchoolButton);
        this.add(listElement);

    }

    /**
     * When an action is performed on the JPanel.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == chooseSchoolButton) {
            canvasAccesser.setSchool(listElement.getSelectedValue());
            canvasAccesser.launchSchool();
        }

    }
}