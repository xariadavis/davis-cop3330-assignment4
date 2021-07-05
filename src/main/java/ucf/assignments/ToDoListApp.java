/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Xaria Davis
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoListApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDoListApp.fxml"));

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("To Do List");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
