/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class NewListController {
    @FXML
    ListView<Item> eventList;
    @FXML
    TextField setTitleName;
    @FXML
    TextField setEventDescription;
    @FXML
    DatePicker setEventDueDate;
    @FXML
    String description;
    @FXML
    LocalDate dueDate;
    @FXML
    Item item = new Item(description, dueDate);
    @FXML
    String title;
    @FXML
    ArrayList<Item> theList = new ArrayList<Item>();
    @FXML
    List list = new List(title, theList);
    @FXML
    ArrayList<List> allList = new ArrayList<List>();
    @FXML
    ListDatabase database = new ListDatabase(allList);

    public void backToHome(ActionEvent actionEvent) {
        // declare parent variable
        // set FXMLLoader to load for "ToDoListApp.fxml"
        // needs and IO exception so surround with a try/catch

        // create a new Scene for it -- like homeScreen or something
        // declare a Stage variable and = it the window
        // make the Stage variable set the scene
        // make the Stage variable show the scene
    }

    // needs to add event to list
    // adds due date and description
    // req #4 - 5
    public void addEventButton(ActionEvent actionEvent) {

        // take instance variable of item - for example item;
        // use item.setDescription(setEventDescription.getText()) to set description text
        // use item.setDueDate(setEventDueDate.getValue()) to set due date

        // call addEventToListMethod

        // call refreshEvent() method to reset textfields

    }

    // creates new list
    // refreshes after so user can continue adding lists
    // req #3
    public void addListButton(ActionEvent actionEvent) {
        // call addListToDatabase method

    }

    // clears TextFields after event is added
    public void refreshEvent() {
        // declare setEventDescription.setText(null) to clear event description text field
        // declare setEventDueDate.setValue(null) to clear datePicker
    }

    // clears TextFields after event is added
    public void refreshTitle() {
        // declare setTitleName.setText(null) to clear textfield for title
        // eventList.getItems().clear() to clear events populated in the list
    }

    public void addEventToList(TextField setEventDescription, DatePicker setEventDueDate) {
        // create new event using getters for description and date
        // call eventList.getItems.add(new event declared above) -- to show on list
        // add event to list using list.add
    }

    // method for addListButton
    // req #6 -- should also satisfy #1
    public void addListToDatabase(String title, ArrayList<List> theList) {
        // set the list.title using setTitleName.getText()
        // add the list to the database using database.add(params)

        // call refreshTitle() to reset fields so a new list can be created
    }
}
