/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewListControllerTest {
    // declare test events
        // new item1 = "Draw homescreen mockup", 2021-01-01
        // new item2 = "Do section 15.3", 2021-01-02
    // arraylist actual list = add item1 and item2

    @Test
    // clears TextFields after event is added
    void refreshEvent_doFieldsClear() {
        // test if method nullifies what its supposed to
        // set actual values for textfeild and datepicker  -- use these to test
        // call the method to nullify to actual values
        // set expected values to null
        // assertEquals to see if method nullified values

        // declare actual textfield - set value to "Pick up laundry"
        // declare actual datepicker - set value to "2021-07-09"
        // call refreshEvent
        // declare expected textfield - set value to null
        // declare expected datepicker - set value to null
        // assert equals for actual and expected
    }

    @Test
    // clears TextFields after event is added
    void refreshTitle_doFieldsClear() {
        // test if method nullifies what its supposed to
        // set actual values for textfeild and arrayList  -- use these to test
        // call the method to nullify to actual values
        // set expected values to null
        // assertEquals to see if method nullified values

        // declare actual textfield - set value to "OOP Assignment 4"
        // declare arraylist actual list
        // add items to list
            // actualList.add(item1)
            // actualList.add(item2)
        // declare actual eventList - set values to ("OOP Assignment 4", actualList)
        // call refreshTitle
        // declare expected textfield - set value to null
        // declare expected textfield et value to null
        // declare expected list -- null
        // assert equals for actual and expected
    }

    @Test
    void addEventToList_areEventsAddedToList() {
        // test to see whether or not an event was actually added to list

        // call addEventToList("test description", 1999-01-01);
        // use item variable to get the values for the event declared above
        // use assertEquals to assert the values are equal
    }

    @Test
    void addListToDatabase_areTheTitlesEqual() {
        // test if the method adds/saves title correctly

        // call addListToDatabase("Test", actualList)
        // set actual string to database.getTitle
        // set expected String = "Test"
        // assertEquals (actual = expected)
    }

    @Test
    void addListToDatabase_areTheListsEqual() {
        // test if the method adds/saves title correctly
        // call method passing in ("Test title", actualList (as declared above)) as a test list
        // get the list we just saved using the method and set it to actual value
        // set the actualList to the expected values
        // assertArrayEquals for the actual and expected list

        // call addListToDatabase("Test", actualList)
        // List database.getList
        // Expected list = item1, item2
        // assertEquals (actual = expected)
    }
}