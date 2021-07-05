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
        // call addEventToList("test description", 1999-01-01);
        // use item variable to get the values for the event declared above
        // user assertEquals to assert the values are equal
    }

    @Test
    void addListToDatabase_areTheTitlesEqual() {
        // call addListToDatabase("Test", actualList)
        // String database.getTitle
        // Expected String = Test
        // assertEquals (actual = expected)
    }

    @Test
    void addListToDatabase_areTheListsEqual() {
        // call addListToDatabase("Test", actualList)
        // List database.getList
        // Expected list = item1, item2
        // assertEquals (actual = expected)
    }
}