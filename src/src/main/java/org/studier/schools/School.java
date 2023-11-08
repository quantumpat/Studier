package org.studier.schools;

/**
 * A school to be accessed by the program.
 *
 * @author Patrick Carroll
 * @version November 7th, 2023
 */
public class School {

    /**
     * The name of the school.
     */
    private String name = "";

    /**
     * The canvas header (example:utah.instructure.com <- "utah" would be the canvas header).
     */
    private String canvasHeader = "";

    /**
     * Constructs a new school.
     *
     * @param name The name of the school.
     * @param canvasHeader The canvas header (example:utah.instructure.com <- "utah" would be the canvas header).
     */
    public School(String name, String canvasHeader) {

        this.name = name;
        this.canvasHeader = canvasHeader;

    }

    /**
     * The string version of the object.
     */
    public String toString() {
        return name;
    }

    /**
     * Gets the name of the school.
     * @return The name of the school.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the canvas header (example:utah.instructure.com <- "utah" would be the canvas header).
     * @return The canvas header (example:utah.instructure.com <- "utah" would be the canvas header).
     */
    public String getCanvasHeader() {
        return canvasHeader;
    }

}
