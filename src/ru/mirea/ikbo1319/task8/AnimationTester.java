package ru.mirea.ikbo1319.task8;

import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;

public class AnimationTester extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image(new FileInputStream("C:\\Users\\Xiaomi\\Desktop\\SomeImage.jpg"));
        Image image2 = new Image(new FileInputStream("C:\\Users\\Xiaomi\\Desktop\\DIGIT.png"));

        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(25);
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);
        imageView.setPreserveRatio(true);



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

        //Group group = new Group(text);
        Group group = new Group(imageView);
        Scene scene = new Scene(group,800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
