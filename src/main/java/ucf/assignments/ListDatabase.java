/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListDatabase {
    ArrayList<List> allLists;

    // CONSTRUCTOR -- we want a list of lists
    public ListDatabase(ArrayList<List> allLists) {
        // set this instance of allLists = allLists
    }

    public void add(String title, ArrayList<Item> theList) {
        // add list to list database
        // allLists.add(new List(title, theList));
    }

    public void remove(String title, ArrayList<Item> theList) {
        // remove list from list database
        // allLists.remove(new List(title, theList));
    }

    public ArrayList<List> getAllLists() {
        return allLists;
    }
}
