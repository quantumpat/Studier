package org.studier.schools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public static final School UTAH = new School("University of Utah", "utah");
    public static final School WISCO = new School("University of Wisconsin", "wisc");
    public static final School UDenver = new School("University of Denver", "du");
    public static final School CUBoulder = new School("University of Colorado Boulder", "cuboulder");
    public static final School Clemson = new School("Clemson University", "clemson");
    public static final School BostonCollege = new School("Boston College", "bostoncollege");

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
        schools.add(WISCO);
        schools.add(UDenver);
        schools.add(CUBoulder);
        schools.add(Clemson);
        schools.add(BostonCollege);


        //Alphabetize the list
        //Collections.sort(schools);

    }

    /**
     * Get the list of schools that have been registered.
     * @return The list of schools that have been registered.
     */
    public static ArrayList<School> getSchools() {
        return schools;
    }

}
