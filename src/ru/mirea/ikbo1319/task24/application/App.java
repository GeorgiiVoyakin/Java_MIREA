package ru.mirea.ikbo1319.task24.application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Menu fileMenu = new Menu("File");

        MenuItem newItem = new MenuItem("New");
        MenuItem openFileItem = new MenuItem("Open");

        fileMenu.getItems().addAll(newItem, openFileItem);

        MenuBar menuBar = new MenuBar(fileMenu);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        newItem.setOnAction(e -> {
            ICreateDocument createDocument = new CreateTextDocument();
            System.out.println("New file was created");
            System.out.print("Type: ");
            System.out.println(createDocument.createNew().getType());
        });

        openFileItem.setOnAction(e -> {
            ICreateDocument createDocument = new CreateTextDocument();
            System.out.println("File successfully opened");
            System.out.print("Type: ");
            System.out.println(createDocument.createOpen().getType());
        });

        Scene scene = new Scene(borderPane, 800, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
