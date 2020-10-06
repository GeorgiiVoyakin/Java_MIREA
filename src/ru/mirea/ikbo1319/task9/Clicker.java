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
        StackPane buffer = new StackPane();

        Button button = new Button("Click me!");
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);
        Scene scene = new Scene(stackPane,WIDTH, HEIGHT);

        Button button2 = new Button("Click me!");
        StackPane stackPane2 = new StackPane();
        stackPane2.getChildren().add(buffer);
        stackPane2.getChildren().add(button2);
        Scene scene2 = new Scene(stackPane2, WIDTH, HEIGHT);

        button.setOnAction(e -> {
            buffer.getChildren().clear();
            buffer.getChildren().add(TesterFx.getShapes(20));
            stage.setScene(scene2);}
            );
        button2.setOnAction(e -> stage.setScene(scene));

        stage.setTitle("Java Shapes and Button Task 9");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
