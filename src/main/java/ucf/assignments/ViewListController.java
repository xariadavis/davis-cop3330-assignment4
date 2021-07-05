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
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ViewListController {

    @FXML
    private ChoiceBox filterChoiceBox;
    @FXML
    ObservableList<String> filterChoiceBoxList;
    @FXML
    ObservableList<String> editItemsChoiceBoxList;


    @FXML
    private void initialize() {
        // call method to set values for filter choice box -- setFilterChoiceBox
    }

    // populate TextFeild with title
    // req #1
    public void fillListTitle(ActionEvent actionEvent) {
        // get Textfeild
        // fill with list.getTitle() method
    }

    public void backToHome(ActionEvent actionEvent) {
        // on click, change scene back to the home screen -- DONE
        // declare parent variable
        // set FXMLLoader to load for "ToDoListApp.fxml"
        // needs and IO exception so surround with a try/catch

        // create a new Scene for it -- like homeScreen or something
        // declare a Stage variable and = it the window
        // make the Stage variable set the scene
        // make the Stage variable show the scene

    }

    // allows user to edit the title
    public void changeTitle(InputMethodEvent inputMethodEvent) {
        // call changeListTitle method
    }

    // on click open a new window to add item to list? probably take care of it on saturday
    // req #9
    @FXML
    private void addItemToExistingList() {
        // open AddItemWindow.fxml
        // wrap in try/catch because of IO exception
        // load FXMLLoader to "AddItemWindow.fxml"
        // set new Parent root
        // set new Stage
        // use the Stage to set new Scene
        // show the stage

    }

    private void setFilterChoiceBox() {
        // set values for filterChoiceBoxList = "All", "Completed", "Incomplete"
        // set value for filterChoice box to All since the list will initially display all items
        // call filterChoiceBox and set item to filterChoiceBoxList
    }

    public void filterChoiceBoxSelection(MouseEvent mouseEvent) {
        // call filterChoiceBoxSelectionStatus method
    }

    public void editItemButtonClicked(ActionEvent actionEvent) {
        // open AddItemWindow.fxml
        // wrap in try/catch because of IO exception
        // load FXMLLoader to "EditListWindow.fxml"
        // set new Parent root
        // set new Stage
        // use the Stage to set new Scene
        // show the stage
    }

    public void removeItemButtonClicked(ActionEvent actionEvent) {
        // getName and dueDate from the item / just the item itself that was clicked in listView
        // call removeItemFromList(item) method
    }

    public void markAsComplete(ActionEvent actionEvent) {
        // call isComplete() method
        // call setListColorToCompleted(true)
    }

    // ----------------

    // method for changeTitle
    // req #8
    public void changeListTitle (String newTitle) {
        // using variable for list, call list.setTitle
        // use the newTitle to set the new title name
        // action event -- enter button clicked? Potentially change to save button
    }

    // on click of specific to do list from list
    // on click of remove toggle
    // *tested functionality in another method -- may remove this one and redirect to that one
    // req #7
    public void removeExistingList() {
        // use database and allLists.remove specific lists
    }

    // if user marks item complete the set bool to true
    public boolean ItemComplete(){
        return true;
    }

    // if item is complete set background color to green
    private void setListColorToCompleted(boolean itemStatus) {
        // if item status is true
            // set background color of list item to green
        // else
            // do nothing
    }

    // filter items
    // req #14 - 16
    public void filterListItems() {
        // when user makes selection
        // if click on string "Completed"
            // only display items with itemStatus = true
        // if click on string "Incomplete"
            // only display items with itemStatus = false
        // else
            // display all and forgo using item status
    }

    public void removeItemFromList(Item item){
        // call class variable for List and .remove(itemClicked)
    }
}
