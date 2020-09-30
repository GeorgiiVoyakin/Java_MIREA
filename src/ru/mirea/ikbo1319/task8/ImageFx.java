package ru.mirea.ikbo1319.task8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImageFx extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(getParameters().getRaw().get(0)));
        ImageView imageView = new ImageView(image);

        imageView.setX(50);
        imageView.setY(25);

        imageView.setFitHeight(455);
        imageView.setFitWidth(500);

        imageView.setPreserveRatio(true);

        Group root = new Group(imageView);

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("Loading an image");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
