package org.studier.app;

import org.studier.canvas.CanvasAccesser;

import javax.swing.*;
import java.awt.*;

/**
 * The control window (appears on top of selenium browser).
 *
 * @author Patrick Carroll
 * @version November 7th, 2023
 */
public class ControlWindow {

    /**
     * The width of the control view.
     */
    public static final int WIDTH = 600;

    /**
     * The height of the control view.
     */
    public static final int HEIGHT = 400;

    /**
     * Accesses canvas page.
     */
    private CanvasAccesser canvasAccesser;

    /**
     * The window itself.
     */
    private JFrame frame;

    /**
     * The choose school panel.
     */
    private ChooseSchoolPanel chooseSchoolPanel;

    /**
     * Constructs a new choose school panel.
     *
     * @param canvasAccesser The canvas accesser being used to access the canvas.
     */
    public ControlWindow(CanvasAccesser canvasAccesser) {

        this.canvasAccesser = canvasAccesser;

        frame = new JFrame("Studier Control View");
        frame.setSize(WIDTH, HEIGHT);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chooseSchoolPanel = new ChooseSchoolPanel(canvasAccesser);

        frame.add(chooseSchoolPanel);
        frame.pack();

        frame.setVisible(true);

    }

}
