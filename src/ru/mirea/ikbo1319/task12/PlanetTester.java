package ru.mirea.ikbo1319.task12;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class PlanetTester extends Application {
    private static final double WIDTH = 800;
    private static final double HEIGHT = 600;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Mercury");
        Button button2 = new Button("Venus");
        Button button3 = new Button("Earth");
        Button button4 = new Button("Mars");
        Button button5 = new Button("Jupiter");
        Button button6 = new Button("Saturn");
        Button button7 = new Button("Uranus");
        Button button8 = new Button("Neptune");

        Button buttonGetMass = new Button("Get mass of the planet");
        Button buttonGetRadius = new Button("Get radius of the planet");
        Button buttonGetGravity = new Button("Get free fall acceleration\n on the planet");
        Button buttonMenu = new Button("Main menu");
        buttonGetMass.setPrefWidth(150);
        buttonGetMass.setPrefHeight(50);
        buttonGetRadius.setPrefWidth(150);
        buttonGetRadius.setPrefHeight(50);
        buttonMenu.setPrefWidth(150);
        buttonMenu.setPrefHeight(50);
        buttonGetGravity.setPrefWidth(150);
        buttonGetGravity.setPrefHeight(50);

        Label label = new Label();
        label.setFont(Font.font(30));

        Label labelInfo = new Label();
        labelInfo.setFont(Font.font(30));

        VBox vBoxInfo = new VBox(label, buttonGetMass, buttonGetRadius, buttonGetGravity,labelInfo, buttonMenu);
        vBoxInfo.setSpacing(10);
        vBoxInfo.setAlignment(Pos.CENTER);

        Scene sceneInfo = new Scene(vBoxInfo, WIDTH, HEIGHT);

        ArrayList<Button> buttons = new ArrayList<>();
        buttons.addAll(Arrays.asList(button1, button2, button3, button4, button5, button6, button7, button8));
        for (Button button : buttons) {
            button.setPrefWidth(100);
            button.setPrefHeight(50);
            button.setOnAction(e -> {
                label.setText(button.getText());
                labelInfo.setText("");
                primaryStage.setScene(sceneInfo);
            });
        }

        Text text = new Text("Choose planet");
        text.setFont(Font.font(30));

        VBox vBox = new VBox(text);
        vBox.setSpacing(10);
        vBox.getChildren().addAll(buttons);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox, WIDTH, HEIGHT);

        buttonMenu.setOnAction(e -> {
            primaryStage.setScene(scene);
        });

        buttonGetMass.setOnAction(e -> {
            labelInfo.setText(label.getText() + " mass is ");
            switch (label.getText()) {
                case "Mercury":
                    labelInfo.setText(labelInfo.getText() + Planet.MERCURY.getMass() + " kg");
                    break;
                case "Venus":
                    labelInfo.setText(labelInfo.getText() + Planet.VENUS.getMass() + " kg");
                    break;
                case "Earth":
                    labelInfo.setText(labelInfo.getText() + Planet.EARTH.getMass() + " kg");
                    break;
                case "Mars":
                    labelInfo.setText(labelInfo.getText() + Planet.MARS.getMass() + " kg");
                    break;
                case "Jupiter":
                    labelInfo.setText(labelInfo.getText() + Planet.JUPITER.getMass() + " kg");
                    break;
                case "Saturn":
                    labelInfo.setText(labelInfo.getText() + Planet.SATURN.getMass() + " kg");
                    break;
                case "Uranus":
                    labelInfo.setText(labelInfo.getText() + Planet.URANUS.getMass() + " kg");
                    break;
                case "Neptune":
                    labelInfo.setText(labelInfo.getText() + Planet.NEPTUNE.getMass() + " kg");
                    break;
                default:
                    labelInfo.setText("Error");
            }
        });

        buttonGetRadius.setOnAction(e -> {
            labelInfo.setText(label.getText() + " radius is ");
            switch (label.getText()) {
                case "Mercury":
                    labelInfo.setText(labelInfo.getText() + Planet.MERCURY.getRadius() + " meters");
                    break;
                case "Venus":
                    labelInfo.setText(labelInfo.getText() + Planet.VENUS.getRadius() + " meters");
                    break;
                case "Earth":
                    labelInfo.setText(labelInfo.getText() + Planet.EARTH.getRadius() + " meters");
                    break;
                case "Mars":
                    labelInfo.setText(labelInfo.getText() + Planet.MARS.getRadius() + " meters");
                    break;
                case "Jupiter":
                    labelInfo.setText(labelInfo.getText() + Planet.JUPITER.getRadius() + " meters");
                    break;
                case "Saturn":
                    labelInfo.setText(labelInfo.getText() + Planet.SATURN.getRadius() + " meters");
                    break;
                case "Uranus":
                    labelInfo.setText(labelInfo.getText() + Planet.URANUS.getRadius() + " meters");
                    break;
                case "Neptune":
                    labelInfo.setText(labelInfo.getText() + Planet.NEPTUNE.getRadius() + " meters");
                    break;
                default:
                    labelInfo.setText("Error");
            }
        });

        buttonGetGravity.setOnAction(e -> {
            labelInfo.setText("Free fall acceleration on " + label.getText() + " equals\n ");
            switch (label.getText()) {
                case "Mercury":
                    labelInfo.setText(labelInfo.getText() + String.format("%.1f", Planet.MERCURY.surfaceGravity()) + " meters per square second");
                    break;
                case "Venus":
                    labelInfo.setText(labelInfo.getText() + String.format("%.1f", Planet.VENUS.surfaceGravity()) + " meters per square second");
                    break;
                case "Earth":
                    labelInfo.setText(labelInfo.getText() + String.format("%.1f", Planet.EARTH.surfaceGravity()) + " meters per square second");
                    break;
                case "Mars":
                    labelInfo.setText(labelInfo.getText() + String.format("%.1f", Planet.MARS.surfaceGravity()) + " meters per square second");
                    break;
                case "Jupiter":
                    labelInfo.setText(labelInfo.getText() + String.format("%.1f", Planet.JUPITER.surfaceGravity()) + " meters per square second");
                    break;
                case "Saturn":
                    labelInfo.setText(labelInfo.getText() + String.format("%.1f", Planet.SATURN.surfaceGravity()) + " meters per square second");
                    break;
                case "Uranus":
                    labelInfo.setText(labelInfo.getText() + String.format("%.1f", Planet.URANUS.surfaceGravity()) + " meters per square second");
                    break;
                case "Neptune":
                    labelInfo.setText(labelInfo.getText() + String.format("%.1f", Planet.NEPTUNE.surfaceGravity()) + " meters per square second");
                    break;
                default:
                    labelInfo.setText("Error");
            }
        });

        primaryStage.setTitle("Planets");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
