package org.studier.app;

import org.studier.canvas.CanvasAccesser;
import org.studier.schools.SchoolManager;

/**
 * The Studier Application.
 *
 * @author Patrick Carroll
 * @version November 7th, 2023
 */
public class StudierApplication {

    /**
     * Accesses canvas page.
     */
    private CanvasAccesser canvasAccesser;

    /**
     * A control view for users to complete tasks.
     */
    private ControlWindow controlWindow;

    /**
     * Constructs and launches a new Studier application.
     */
    public StudierApplication() {

        //MUST BE HERE
        SchoolManager.addSchools();

        canvasAccesser = new CanvasAccesser();
        canvasAccesser.init();

        controlWindow = new ControlWindow(canvasAccesser);

    }

}
