package ru.mirea.ikbo1319.task11;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Game extends Application {
    private static final double WIDTH = 800;
    private static final double HEIGHT = 600;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        GameEngine engine = new GameEngine();
        Button button = new Button("Make decision");
        button.setPrefWidth(150);
        button.setPrefHeight(80);

        TilePane tilePaneStart = new TilePane(button);
        tilePaneStart.setOrientation(Orientation.HORIZONTAL);
        tilePaneStart.alignmentProperty().setValue(Pos.BOTTOM_CENTER);

        TilePane hints = new TilePane();
        hints.setOrientation(Orientation.HORIZONTAL);
        hints.alignmentProperty().setValue(Pos.TOP_CENTER);

        TextField textField = new TextField();
        textField.setPromptText("Enter a number");

        Text hintGreater = new Text("My number is greater");
        Text hintLess = new Text("My number is less");
        hintGreater.setFont(Font.font(50));
        hintLess.setFont(Font.font(50));

        StackPane stackPane = new StackPane(hints, tilePaneStart, textField);

        Scene scene = new Scene(stackPane, WIDTH, HEIGHT);

        FileInputStream stream = new FileInputStream(".\\src\\ru\\mirea\\ikbo1319\\task11\\GameOver.png");
        Image image = new Image(stream);
        ImageView imageViewEndGame = new ImageView(image);

        Button restartButton = new Button("Restart");

        TilePane tilePaneEndGame = new TilePane(restartButton);
        tilePaneEndGame.setOrientation(Orientation.HORIZONTAL);
        tilePaneEndGame.alignmentProperty().setValue(Pos.BOTTOM_CENTER);
        restartButton.setPrefWidth(150);
        restartButton.setPrefHeight(80);

        stream = new FileInputStream(".\\src\\ru\\mirea\\ikbo1319\\task11\\Congratulations.png");
        image = new Image(stream);
        ImageView imageViewWinGame = new ImageView(image);

        Button restartButton2 = new Button("Restart");

        TilePane tilePaneWinGame = new TilePane(restartButton2);
        tilePaneWinGame.setOrientation(Orientation.HORIZONTAL);
        tilePaneWinGame.alignmentProperty().setValue(Pos.BOTTOM_CENTER);
        restartButton2.setPrefWidth(150);
        restartButton2.setPrefHeight(80);

        StackPane stackPaneEndGame = new StackPane(imageViewEndGame, tilePaneEndGame);
        Scene sceneEndGame = new Scene(stackPaneEndGame);

        StackPane stackPaneWinGame = new StackPane(imageViewWinGame, tilePaneWinGame);
        Scene sceneWinGame = new Scene(stackPaneWinGame);

        button.setOnAction(e -> {
            engine.makeDecision(Integer.parseInt(textField.getText()));
            if (engine.isGameOver()) {
                primaryStage.setScene(sceneEndGame);
            } else if (engine.isVictory()) {
                primaryStage.setScene(sceneWinGame);
            }
            if (engine.compare(Integer.parseInt(textField.getText())) == 1) {
                if (! hints.getChildren().isEmpty()) {
                    hints.getChildren().remove(hintGreater);
                }
                if (! hints.getChildren().contains(hintLess)) {
                    hints.getChildren().add(hintLess);
                }
            } else {
                if (! hints.getChildren().isEmpty()) {
                    hints.getChildren().remove(hintLess);
                }
                if (! hints.getChildren().contains(hintGreater)) {
                    hints.getChildren().add(hintGreater);
                }
            }
            textField.clear();
        });

        restartButton.setOnAction(e -> {
            engine.startGame();
            if (! hints.getChildren().isEmpty()) {
                hints.getChildren().clear();
            }
            textField.clear();
            primaryStage.setScene(scene);
        });

        restartButton2.setOnAction(e -> {
            engine.startGame();
            if (! hints.getChildren().isEmpty()) {
                hints.getChildren().clear();
            }
            textField.clear();
            primaryStage.setScene(scene);
        });

        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Game");
    }
}
