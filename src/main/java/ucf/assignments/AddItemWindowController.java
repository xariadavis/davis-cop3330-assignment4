/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */


package ucf.assignments;

import javafx.event.ActionEvent;

import java.time.LocalDate;

public class AddItemWindowController {

    // on click of save button save edited version of description and due date
    // adds item to existing list
    // req #9
    public void saveDescriptionAndDate(ActionEvent actionEvent) {
        // call item set description value and set it to descriptionField.getText
        // call item set due date value and set it to date picker date value
        // call saveInfo method
    }

    // on click of save button save added version of description and due date
    // req #9
    public void saveInfo(String description, LocalDate dueDate) {
        // create a new event using description and dueDate
        // call list view event list from NewListController and add the new event to the list and show it
        // add event to its actual list in the database
        // close the window
    }
}
