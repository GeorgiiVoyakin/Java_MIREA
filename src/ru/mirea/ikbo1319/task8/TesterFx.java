package ru.mirea.ikbo1319.task8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class TesterFx extends Application {
    final int WIDTH = 800;
    final int HEIGHT = 600;

    @Override
    public void start(Stage stage) throws Exception {
        /*Line line = new Line();
        line.setStartX(0);
        line.setStartY(0);
        line.setEndX(800);
        line.setEndY(600);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(150.0f);
        rectangle.setY(75.0f);
        rectangle.setWidth(300.0f);
        rectangle.setHeight(150.0f);*/

        Group group = getShapes(20);
        Scene scene = new Scene(group ,WIDTH, HEIGHT);
        stage.setTitle("Java Shapes Task 8");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Group getShapes(int amount){
        Random generator = new Random();
        Group group = new Group();
        for(int i = 0; i < amount; i++){
            int choice = generator.nextInt(3);
            switch (choice){
                case 0:
                    Line line = new Line();
                    line.setStartX(generator.nextInt(500));
                    line.setStartY(0);
                    line.setEndX(generator.nextInt(500));
                    line.setEndY(600);
                    line.setStroke(getRandomColor());
                    group.getChildren().add(line);
                    break;
                case 1:
                    Rectangle rectangle = new Rectangle();
                    rectangle.setX(generator.nextInt(800));
                    rectangle.setY(generator.nextInt(600));
                    rectangle.setWidth(30.0f);
                    rectangle.setHeight(15.0f);
                    rectangle.setFill(getRandomColor());
                    group.getChildren().add(rectangle);
                    break;
                case 2:
                    Polygon polygon = new Polygon();
                    polygon.getPoints().addAll(new Double[]{
                            (double) generator.nextInt(50), (double) generator.nextInt(50),
                            (double) generator.nextInt(50), (double) generator.nextInt(50),
                            (double) generator.nextInt(50), (double) generator.nextInt(50),
                    });
                    polygon.setFill(getRandomColor());
                    group.getChildren().add(polygon);
            }
        }
        return group;
    }

    public static Color getRandomColor(){
        Random generator = new Random();
        int choice = generator.nextInt(11);
        switch (choice){
            case 0: return Color.BLUE;
            case 1: return Color.BLACK;
            case 2: return Color.RED;
            case 3: return Color.YELLOW;
            case 4: return Color.GREEN;
            case 5: return Color.GREY;
            case 6: return Color.MAGENTA;
            case 7: return Color.ORANGE;
            case 8: return Color.LIGHTBLUE;
            case 9: return Color.PURPLE;
            case 10: return Color.VIOLET;
        }
        return Color.BLACK;
    }
}
