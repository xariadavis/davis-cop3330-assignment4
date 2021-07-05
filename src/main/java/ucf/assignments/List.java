/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import java.time.LocalDate;
import java.util.ArrayList;

public class List {
    String title;
    ArrayList<Item> theList = new ArrayList<Item>();

    // declare constructor
    public List(String title, ArrayList<Item> theList) {
        // set this instance of title = to title
        // set this instance of theList = the List
    }

    // adds item to the list
    public void add(String description, LocalDate dueDate) {
        // basically theList.add(new Item(item info));
    }

    // removes item from the list
    public void remove(Item item) {
        // basically theList.remove(new Item(item info));
    }

    // getter for the list
    public ArrayList<Item> getList() {
        // returns the list
        return theList;
    }

    // setter for the title
    public void setTitle(String title) {
        // set this instance of title = title
    }

    // getter for the title
    public String getTitle() {
        // returns the title
        return title;
    }

}
