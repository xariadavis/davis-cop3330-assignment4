/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoListAppController {

    // on click button will open file explorer
    public void LoadListFromStorageClicked(ActionEvent actionEvent) {
        // surround with try catch because will need and IO Exception
            // use Runtime library and command it to "explorer.exe /select, path"
            // open it in the viewList FXML as if it were just a list in the database
    }

    // button clicked -- take to another page where the list is actually created
    public void createNewListClicked(ActionEvent actionEvent) {
        // call for new scene that displays empty new list

        // declare parent variable
        // set FXMLLoader to load for "NewList.fxml"
        // needs and IO exception so surround with a try/catch

        // create a new Scene for it -- like createNewList or something
        // declare a Stage variable and = it the window
        // make the Stage variable set the scene
        // make the Stage variable show the scene
    }

    // button clicked -- call for scene that displays all existing lists in database
    public void existingListsButtonClicked(ActionEvent actionEvent) {

        // declare parent variable
            // set FXMLLoader to load for "ExistingToDoLists.fxml"
                // needs and IO exception so surround with a try/catch

        // create a new Scene for it -- like existingListScene or something
        // declare a Stage variable and = it the window
        // make the Stage variable set the scene
        // make the Stage variable show the scene
    }
}
