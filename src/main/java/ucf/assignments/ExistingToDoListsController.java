/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ExistingToDoListsController {
    ArrayList<List> allLists = new ArrayList<List>();
    ListDatabase database = new ListDatabase(allLists);

    // req #14
    public void initialize() {
        // call populateExistingList method to populate list with existing lists
    }

    // on click, change scene back to the home screen -- DONE
    public void backButtonClicked(ActionEvent actionEvent) {
        // declare parent variable
        // set FXMLLoader to load for "ToDoListApp.fxml"
        // needs an IO exception so surround with a try/catch

        // create a new Scene for it -- like homeScreen or something
        // declare a Stage variable and = it the window
        // make the Stage variable set the scene
        // make the Stage variable show the scene

        Parent goBackToHome = null;
        try {
            goBackToHome = FXMLLoader.load(getClass().getResource("ToDoListApp.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene homeScreen = new Scene(goBackToHome);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(homeScreen);
        window.show();
    }

    // populate list of existing lists
    // place in initialize
    // req #14
    public void populateExistingList() {
        // call for an observable list
        // call for listview of listOfExistingLists as per the fxID
        // listOfExistingItems.setItems(set to getAllLists from ListDatabase)
    }

    // if addNewList button is clicked add new list
    // req #6
    public void addNewList(ActionEvent actionEvent) {
        // call addNewListToDatabase() method
    }

    public void removeList(ActionEvent actionEvent) {
        // use textfield getText feature to get the title of the list
        // use list.getList to get the items for the list that was clicked
        // call removeListFromDatabase() method
    }

    public void saveList(ActionEvent actionEvent) {
        // call saveSingleListToTXT() method
    }

    public void saveAllLists(ActionEvent actionEvent) {
        // call saveAllToDoListsToTXT() method
    }

    // if addNewList button is clicked add new list
    // *redirects user to method that's already been tested - no need to test
    // req #6
    public void addNewListToDatabase() {
        // call created instance of ToDoListAppController
        // use variable to call createNewListButtonClicked method
        // takes user to Create New List page (redirect)
    }

    public void removeListFromDatabase(String title, ArrayList<Item> theList) {
        // call ListDatabase instance variable -- database for example
        // call database.remove method for the list that was clicked to remove it
    }

    public void saveSingleListToTXT() {
        // create TXT outfile variable
        // call printStream to print to outfile
        // open filewriter
        // declare a for loop of list.length
            // loop through and filewrite all items in list to outfile TXT
        // close filewrite/printstream
    }

    public void saveAllToDoListsToTXT() {
        // declare for loop for database.length
            // call saveSingleListToTXT() method that many times
    }
}
