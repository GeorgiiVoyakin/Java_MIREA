package ru.mirea.ikbo1319.task9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ru.mirea.ikbo1319.task8.TesterFx;

public class Clicker extends Application {
    final int WIDTH = 800;
    final int HEIGHT = 600;

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Group group2 = TesterFx.getShapes(20);
        Scene scene2 = new Scene(group2, WIDTH, HEIGHT);

        Button button = new Button("Click me!");
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);
        Scene scene = new Scene(stackPane,WIDTH, HEIGHT);

        button.setOnAction(e -> stage.setScene(scene2));

        stage.setTitle("Java Shapes Task 8");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
