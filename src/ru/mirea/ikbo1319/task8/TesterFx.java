package ru.mirea.ikbo1319.task8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class TesterFx extends Application {
    final int WIDTH = 800;
    final int HEIGHT = 600;

    @Override
    public void start(Stage stage) throws Exception {
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
                    int randomX = generator.nextInt(800);
                    int randomY = generator.nextInt(600);
                    Circle templateCircle = new Circle(randomX, randomY, getRandomColor(), generator.nextInt(100));
                    group.getChildren().add(templateCircle.getEntity());
                    break;
                case 1:
                    int randomWidth = generator.nextInt(120);
                    int randomHeight = generator.nextInt(90);
                    int randomVertex = generator.nextInt(800);
                    int randomVertexY = generator.nextInt(600);
                    Rectangle rectangle = new Rectangle(randomVertex, randomVertexY, getRandomColor(), randomWidth, randomHeight);
                    group.getChildren().add(rectangle.getEntity());
                    break;
                case 2:
                    int vertex1 = generator.nextInt(800);
                    int vertex2 = generator.nextInt(600);
                    int vertex3 = generator.nextInt(800);
                    int vertex4 = generator.nextInt(600);
                    int vertex5 = generator.nextInt(800);
                    int vertex6 = generator.nextInt(600);
                    Triangle triangle = new Triangle(vertex1, vertex2, getRandomColor(), vertex3, vertex4, vertex5, vertex6);
                    group.getChildren().add(triangle.getEntity());
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