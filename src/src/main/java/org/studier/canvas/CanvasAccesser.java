package org.studier.canvas;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Opens a Chrome browser and accesses canvas elements.
 *
 * @author Patrick Carroll
 * @version November 7, 2023
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

        setup();

        //END
        initialized = true;

    }

    /**
     * Sets up the webdriver directory.
     */
    public static void setupWebdriverChromeDriver() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");

        CanvasAccesser.chromeDriverSetup = true;

    }

    /**
     * Sets up the chrome driver.
     */
    public void setup() {

        driver = new ChromeDriver();

    }

    /**
     * Quits the chrome driver.
     */
    public void teardown() {

        if (driver != null) {
            driver.quit();
        }

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
     * The chrome driver accessing the canvas page.
     * @return The chrome driver accessing the canvas page.
     */
    public ChromeDriver getDriver() {
        return driver;
    }

}
