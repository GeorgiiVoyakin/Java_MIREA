package ru.mirea.ikbo1319.task8;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationTester extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text();

        text.setText("Java");
        text.setX(100);
        text.setY(150);
        text.setFont(Font.font(50));

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(text);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(Timeline.INDEFINITE);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();

        Group group = new Group(text);
        Scene scene = new Scene(group,800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
