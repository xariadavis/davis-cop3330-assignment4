/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ViewListControllerTest {
    // ArrayList<List> allLists;
    // ListDatabase database = new ListDatabase(allLists);
    // ArrayList<Item> theList;
    // List list = new List("test", theList);


    @Test
    void changeListTitle() {
        // check if the method actually goes in the database and changes the title
        // set an initial title using a setter
        // call method and pass in a new title
        // set the actual value to the title using a getter
        // set expected value to the new title we passed in
        // assert that the actual and expected values are equal

        // list.setTitle("temp")
        // call changeListTitle("actual")
        // String actual = list.getTitle
        // String expected = "actual"
        // assertEquals(expected, actual)
    }

    @Test
    void itemComplete_returnsTrueBoolean() {
        // boolean actual = itemComplete; -- method should always return true
        // assertTrue(actual)
    }

    @Test
    void removeItemFromList() {
        // test to see if item was removed from list
        // we will add a random item to database using list.add so we can remove ir using the method
        // call the method to remove test item
        // probably use print stream to see items in the list
            // think on this one
        // assert that the list is null since we removed the item
        // try with more than one item and test that only ONE of them is removed

        // use list.add() to create a test item
        // use removeItemFromList() to remove item created above
        // use print stream to print item in list
        // bytestream actual:
            // should show nothing
        // assert equals(expected, actual) both = null
    }
}