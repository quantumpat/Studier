package org.studier.canvas;

import org.openqa.selenium.chrome.ChromeDriver;
import org.studier.schools.School;

/**
 * Opens a Chrome browser and accesses canvas elements.
 *
 * @author Patrick Carroll
 * @version November 7th, 2023
 */
public class CanvasAccesser {

    /**
     * Whether the chrome driver has been set up or not.
     */
    private static boolean chromeDriverSetup = false;

    /**
     * Has the canvas accesser been initialized or not.
     */
    private boolean initialized = false;

    /**
     * The school's whose canvas should be accessed.
     */
    private School currentSchool = null;

    /**
     * The chrome driver being used.
     */
    private ChromeDriver driver;

    /**
     * Constructs a new canvas accesser.
     */
    public CanvasAccesser() {}

    /**
     * Initializes the canvas accesser.
     */
    public void init() {

        /*
         * Initialize the Chrome Web Driver
         */
        if (!CanvasAccesser.isChromeDriverSetup())
            CanvasAccesser.setupWebdriverChromeDriver();

        if (!CanvasAccesser.isChromeDriverSetup())
            throw new RuntimeException("The canvas accesser's web driver was not setup properly!");

        //END
        initialized = true;

    }

    /**
     * Sets up the webdriver directory.
     */
    public static void setupWebdriverChromeDriver() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/src/main/resources/chromedriver");

        System.out.println("Chrome driver successfully setup!");
        CanvasAccesser.chromeDriverSetup = true;

    }

    /**
     * Launches a school's canvas page onto a newly created Chrome browser.
     */
    public void launchSchool() {

        if (currentSchool == null)
            return;

        driver = new ChromeDriver();
        System.out.println("Chrome browser launched!");

        driver.get("https://" + currentSchool.getCanvasHeader() + ".instructure.com");

    }

    /**
     * Quits the chrome driver.
     */
    public void close() {

        if (driver != null)
            driver.quit();

    }

    /**
     * Sets the current school to a particular school.
     * @param school The school to be set.
     */
    public void setSchool(School school) {

        currentSchool = school;

    }

    /**
     * Checks if the chrome driver setup has been completed or not.
     * @return Whether the chrome driver setup has been completed or not.
     */
    public static boolean isChromeDriverSetup() {
        return CanvasAccesser.chromeDriverSetup;
    }

    /**
     * Checks if the canvas accesser has been initialized or not.
     * @return Whether the canvas accesser has been initialized or not.
     */
    public boolean isInitialized() {
        return initialized;
    }

    /**
     * Get the current school being accessed by the canvas accesser.
     * @return The current school being accessed by the canvas accesser.
     */
    public School getCurrentSchool() {
        return currentSchool;
    }

    /**
     * The chrome driver accessing the canvas page.
     * @return The chrome driver accessing the canvas page.
     */
    public ChromeDriver getDriver() {
        return driver;
    }

}
