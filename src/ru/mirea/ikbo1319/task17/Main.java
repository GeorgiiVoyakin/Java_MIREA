package ru.mirea.ikbo1319.task17;

import com.sun.glass.ui.GlassRobot;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
    private final double WIDTH = 1000;
    private final double HEIGHT = 700;

    private Circle circle = new Circle(40);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        circle.setCenterX(100);
        circle.setCenterY(200);
        circle.setFill(Color.CYAN);
        group.getChildren().add(circle);
        Scene scene = new Scene(group, WIDTH, HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.show();

        prepareAnimation();
    }

    private void prepareAnimation() {
        //GlassRobot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                //System.out.println(robot.getMouseX());
                //System.out.println(robot.getMouseY());
                circle.setCenterX(50);
                circle.setCenterY(300);
            }
        };
        timer.start();
    }
}
