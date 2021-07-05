/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExistingToDoListsControllerTest {
    // possibly populate test database
    // ArrayList<List> allLists = new ArrayList<List>();
    // ListDatabase database = new ListDatabase(allLists);

    @Test
    void populateExistingList() {
        // database.add(testList)
        // call printstream/bytestream for populateExistingList
            // should print testList
        // string expected = "testList"
        // assertEquals(expected, actual)

    }

    @Test
    void removeListFromDatabase() {
        // use database.add() to create a test list
        // use removeListFromDatabase() to remove list created above
        // use print stream to print lists in database
        // bytestream actual:
            // should show nothing
        // assert equals(expected, actual) both = null
    }

    @Test
    void saveSingleListToTXT() {
        // test if file was created
        // call method
        // File testFile = new File("/output.txt");
        // assertTrue(testFile.exists());
    }

    @Test
    void saveAllToDoListsToTXT() {
        // test if file was created
        // call method
        // String output
        //File testFile = new File(output);
        // for(int i = 0; int i < 5; i++) {
            //"/output" + j + ".txt"
            // j++
            //assertTrue(testFile.exists());
    }
}