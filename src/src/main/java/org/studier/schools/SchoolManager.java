package org.studier.schools;

import java.util.ArrayList;

/**
 * Manages all the schools who have access to the program.
 *
 * @author Patrick Carroll
 * @version November 7th, 2023
 */
public class SchoolManager {

    /*
     * Add schools
     *
     * - make sure to add school in addSchools() method
     */

    /**
     * University of Utah (added)
     */
    public static final School UTAH = new School("University of Utah", "utah");

    /**
     * A list of all schools that have been registered.
     */
    private static ArrayList<School> schools = new ArrayList<>();

    /**
     * Add the schools to the list.
     */
    public static void addSchools() {

        //Add schools below:
        schools.add(UTAH);

    }

    /**
     * Get the list of schools that have been registered.
     * @return The list of schools that have been registered.
     */
    public static ArrayList<School> getSchools() {
        return schools;
    }

}
