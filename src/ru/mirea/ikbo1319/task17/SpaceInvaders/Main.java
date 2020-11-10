package ru.mirea.ikbo1319.task17.SpaceInvaders;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {
    private final double WIDTH = 1000;
    private final double HEIGHT = 700;

    private Circle circle = new Circle(40);
    private Circle player = new Circle(30);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(".\\src\\ru\\mirea\\ikbo1319\\task17\\enemy.png");
        Image image = new Image(stream);
        ImageView enemyImage = new ImageView(image);
        enemyImage.setX(500);
        enemyImage.setY(350);

        // stream = new FileInputStream(".\\src\\ru\\mirea\\ikbo1319\\task17\\spaceShip42x60.png");
        stream = new FileInputStream(".\\src\\ru\\mirea\\ikbo1319\\task17\\pixil-frame-0 (10).png");
        image = new Image(stream);
        ImageView spaceShipImage = new ImageView(image);
        spaceShipImage.setX(0);
        spaceShipImage.setY(0);

        Group group = new Group();

        player.setCenterX(500);
        player.setCenterY(660);
        player.setFill(Color.TOMATO);

        circle.setCenterX(100);
        circle.setCenterY(200);
        circle.setFill(Color.CYAN);
        group.getChildren().addAll(circle, enemyImage, spaceShipImage);
        Scene scene = new Scene(group, WIDTH, HEIGHT);

        scene.setOnMouseMoved(e -> {
            circle.setCenterX(e.getX());
            circle.setCenterY(e.getY());
        });

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.D) {
                spaceShipImage.setX(spaceShipImage.getX() + 10);
            }
            if (e.getCode() == KeyCode.A) {
                spaceShipImage.setX(spaceShipImage.getX() - 10);
            }
            if (e.getCode() == KeyCode.SPACE) {
                spaceShipImage.setX(spaceShipImage.getX() + 958);
            }
            if (e.getCode() == KeyCode.ESCAPE){
                spaceShipImage.setX(0);
            }
            if (e.getCode() == KeyCode.H) {
                fireBullet(group, spaceShipImage);
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static void shoot() {
        Circle bullet = new Circle();
    }

    private void fireBullet(final Group root, final ImageView target) {
        Rectangle bullet = new Rectangle(500, 10, 50, 10);
        bullet.setFill(Color.PURPLE);
        bullet.setX(WIDTH/2);
        bullet.setY(20);

        root.getChildren().add(bullet);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                bullet.setX(bullet.getX() - 10);
                if (bullet.intersects(target.getBoundsInParent())) {
                    this.stop();
                    root.getChildren().remove(bullet);
                }
            }
        };

        timer.start();


        /*root.getChildren().add(bullet);
        final TranslateTransition bulletAnimation = new TranslateTransition(Duration.seconds(1), bullet);
        bulletAnimation.setFromX(WIDTH/2);
        bulletAnimation.setFromY(10);
        bulletAnimation.setToX(0);
        bulletAnimation.setToY(10);

        bullet.boundsInParentProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(bullet.getBoundsInLocal());
            if (bullet.intersects(target.getBoundsInLocal())) {
                System.out.println("Hit!");
                bulletAnimation.stop();
                root.getChildren().remove(bullet);
            }
        });
        bulletAnimation.setOnFinished(event -> root.getChildren().remove(bullet));
        bulletAnimation.play();*/
    }
}
