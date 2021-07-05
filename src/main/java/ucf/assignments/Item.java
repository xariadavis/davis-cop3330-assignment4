/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import java.time.LocalDate;

public class Item {
    String description;
    LocalDate dueDate;
    Boolean itemStatus;

    // declare constructor
    public Item(String description, LocalDate dueDate) {
        // set this instance of description = description
        // set this instance of dueDate = dueDate
        // set this instance of itemStatus = false
    }

    // declare setter for description
    public void setDescription(String description) {
        // set this instance of description = description
    }

    // getter for item description
    public String getDescription() {
        // return description
        return description;
    }

    // setter for dueDate
    public void setDueDate(LocalDate dueDate) {
        // set this instance of dueDate = dueDate
    }

    // getter for dueDate
    public LocalDate getDueDate() {
        // return dueDate
        return dueDate;
    }

    public void setItemStatus(Boolean itemStatus) {
        // set this instance of itemStatus to itemStatus
    }

    public Boolean getItemStatus() {
        return itemStatus;
    }

    // displays text that will appear in list view after event is added
    public String toString() {
        // return a string that displays, for example "On " + getDueDate().toString() + " remember to " + getDescription().toString()
        return "On " + getDueDate().toString() + " remember to " + getDescription().toString();
    }

}
