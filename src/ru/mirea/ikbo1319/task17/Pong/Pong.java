package ru.mirea.ikbo1319.task17.Pong;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Pong extends Application {
    private static final double WIDTH = 1000;
    private static final double HEIGHT = 700;
    private static final double paddleWidth = 10;
    private static final double paddleHeight = 100;
    private static final byte paddleSpeed = 6;
    private static final byte ballSpeed = 3;
    private static final double ballEdge = 15;
    private final Rectangle paddleOne = new Rectangle(paddleWidth, paddleHeight);
    private final Rectangle paddleTwo = new Rectangle(paddleWidth, paddleHeight);
    private final Rectangle ball = new Rectangle(ballEdge, ballEdge);
    private final ArrayList<String> input = new ArrayList<>();
    private SmartVector direction;
    private Text scoreOne;
    private Text scoreTwo;
    private final double ButtonWidth = 150;
    private final double ButtonHeight = 50;
    private final Text playerOne = new Text("playerOne");
    private final Text playerTwo = new Text("playerTwo");
    private Scene menuScene;
    private Scene singleLobby;
    private AnimationTimer gameTimer;
    private boolean single = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pong Game");

        prepareObjects();

        Group root = new Group(paddleOne, paddleTwo, ball, scoreOne, scoreTwo, playerOne, playerTwo);
        VBox controls = new VBox();
        controls.setAlignment(Pos.CENTER);

        VBox lobbyControls = new VBox();
        VBox singleLobbyControls = new VBox();

        Scene gameScene = new Scene(root, WIDTH, HEIGHT);
        gameScene.setFill(Color.BLACK);

        gameScene.setOnKeyPressed(e -> {
            String code = e.getCode().toString();

            // only add once... prevent duplicates
            if (!input.contains(code)) {
                input.add(code);
            }
        });

        gameScene.setOnKeyReleased(e -> {
            String code = e.getCode().toString();
            input.remove(code);
        });

        gameTimer = gameLoop(root, primaryStage);

        Scene lobby = new Scene(lobbyControls, WIDTH, HEIGHT);
        prepareLobby(lobby, gameScene, primaryStage, lobbyControls, gameTimer);

        singleLobby = new Scene(singleLobbyControls, WIDTH, HEIGHT);
        prepareSingleLobby(singleLobby, gameScene, primaryStage, singleLobbyControls, gameTimer);

        menuScene = new Scene(controls, WIDTH, HEIGHT);
        prepareMenu(menuScene, lobby, primaryStage, controls);

        primaryStage.setScene(menuScene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void prepareSingleLobby(Scene current, Scene next, Stage stage, VBox controls, AnimationTimer timer) {
        controls.setAlignment(Pos.CENTER);
        controls.setPadding(new Insets(50));
        current.setFill(Color.BLACK);

        Button start = new Button("Start game");
        start.setPrefWidth(ButtonWidth);
        start.setPrefHeight(ButtonHeight);

        Button backToMenu = new Button("Back to menu");
        backToMenu.setPrefWidth(ButtonWidth);
        backToMenu.setPrefHeight(ButtonHeight);

        TextField nickname = new TextField();
        nickname.setPromptText("nickname");
        nickname.setMaxWidth(200);

        controls.setBackground(Background.EMPTY);
        controls.setSpacing(50);
        controls.getChildren().addAll(nickname, start, backToMenu);

        backToMenu.setOnAction(e -> stage.setScene(menuScene));

        start.setOnAction(e -> {
            if (!nickname.getText().isEmpty()) {
                playerOne.setText(nickname.getText());
                playerOne.setX(scoreOne.getX() - playerOne.getLayoutBounds().getWidth() / 2);
            }
            playerTwo.setText("Artificial Intelligence");
            playerTwo.setX(scoreTwo.getX() - playerTwo.getLayoutBounds().getWidth() / 2);
            stage.setScene(next);
            timer.start();
        });
    }

    private void prepareLobby(Scene current, Scene next, Stage stage, VBox controls, AnimationTimer timer) {
        controls.setAlignment(Pos.CENTER);
        controls.setPadding(new Insets(50));
        current.setFill(Color.BLACK);

        Button start = new Button("Start game");
        start.setPrefWidth(ButtonWidth);
        start.setPrefHeight(ButtonHeight);

        Button backToMenu = new Button("Back to menu");
        backToMenu.setPrefWidth(ButtonWidth);
        backToMenu.setPrefHeight(ButtonHeight);

        TextField nicknameOne = new TextField();
        nicknameOne.setPromptText("nickname");
        TextField nicknameTwo = new TextField();
        nicknameTwo.setPromptText("nickname");

        HBox hBox = new HBox(nicknameOne, nicknameTwo);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(50);

        controls.setBackground(Background.EMPTY);
        controls.setSpacing(50);
        controls.getChildren().addAll(hBox, start, backToMenu);

        backToMenu.setOnAction(e -> stage.setScene(menuScene));

        start.setOnAction(e -> {
            if (!nicknameOne.getText().isEmpty()) {
                playerOne.setText(nicknameOne.getText());
                playerOne.setX(scoreOne.getX() - playerOne.getLayoutBounds().getWidth() / 2);
            }
            if (!nicknameTwo.getText().isEmpty()) {
                playerTwo.setText(nicknameTwo.getText());
                playerTwo.setX(scoreTwo.getX() - playerTwo.getLayoutBounds().getWidth() / 2);
            }
            stage.setScene(next);
            timer.start();
        });
    }

    private void prepareMenu(Scene menu, Scene scene, Stage stage, VBox controls) {
        controls.setSpacing(20);
        menu.setFill(Color.BLACK);

        Button toLobby = new Button("Go to lobby");
        toLobby.setPrefWidth(ButtonWidth);
        toLobby.setPrefHeight(ButtonHeight);

        Button singlePlayer = new Button("Single player");
        singlePlayer.setPrefWidth(ButtonWidth);
        singlePlayer.setPrefHeight(ButtonHeight);

        singlePlayer.setOnAction(e -> {
            single = true;
            stage.setScene(singleLobby);
        });

        toLobby.setOnAction(e -> stage.setScene(scene));
        controls.setBackground(Background.EMPTY);
        controls.getChildren().addAll(toLobby, singlePlayer);
    }

    private AnimationTimer gameLoop(Group gameField, Stage stage) {
        ArtificialIntelligence ai = new ArtificialIntelligence();
        return new AnimationTimer() {
            public void handle(long currentNanoTime) {
                if (single) {
                    input.remove("UP");
                    input.remove("DOWN");
                    ai.setY(paddleTwo.getY());
                    String code = ai.getDirection(ball.getY());
                    if (!input.contains(code)) {
                        input.add(code);
                    }
                }
                if (input.contains("W")) {
                    if (paddleOne.getY() > 0) {
                        paddleOne.setY(paddleOne.getY() - paddleSpeed);
                    }
                }
                if (input.contains("S")) {
                    if (paddleOne.getY() + paddleHeight < HEIGHT) {
                        paddleOne.setY(paddleOne.getY() + paddleSpeed);
                    }
                }
                if (input.contains("UP")) {
                    if (paddleTwo.getY() > 0) {
                        paddleTwo.setY(paddleTwo.getY() - paddleSpeed);
                    }
                }
                if (input.contains("DOWN")) {
                    if (paddleTwo.getY() + paddleHeight < HEIGHT) {
                        paddleTwo.setY(paddleTwo.getY() + paddleSpeed);
                    }
                }

                moveBall(gameField, stage);
            }
        };
    }

    private void moveBall(Group gameField, Stage stage) {
        if (ball.getX() < 0) {
            addPoints(scoreTwo, playerTwo, gameField, stage);
        } else if (ball.getX() + ballEdge > WIDTH) {
            addPoints(scoreOne, playerOne, gameField, stage);
        }
        if (collide()) {
            direction.reverseX();
        }
        if (ball.getY() < 0 | ball.getY() + ballEdge > HEIGHT) {
            direction.reverseY();
        }
        ball.setX(ball.getX() + direction.getX());
        ball.setY(ball.getY() + direction.getY());
    }

    private void addPoints(Text score, Text player, Group gameField, Stage stage) {
        score.setText(String.valueOf(Integer.parseInt(score.getText()) + 1));
        setBallOnStart();
        if (Integer.parseInt(score.getText()) == 10) {
            gameTimer.stop();
            Text winner = new Text(player.getText() + " won !");
            winner.setFill(Color.WHITE);
            winner.setFont(Font.font(30));
            winner.setX(WIDTH / 2 - winner.getLayoutBounds().getWidth() / 2);
            winner.setY(HEIGHT / 2 + 50);

            Button backToMenu = new Button("Back to menu");
            backToMenu.setPrefWidth(ButtonWidth);
            backToMenu.setPrefHeight(ButtonHeight);
            backToMenu.setLayoutX(WIDTH / 2 - ButtonWidth / 2);
            backToMenu.setLayoutY(HEIGHT / 2 + 100);

            backToMenu.setOnAction(e -> {
                setPaddlesPosition();
                gameField.getChildren().removeAll(winner, backToMenu);
                scoreOne.setText("0");
                scoreTwo.setText("0");
                playerTwo.setText("playerTwo");
                playerTwo.setX(scoreTwo.getX() - playerTwo.getLayoutBounds().getWidth() / 2);
                single = false;
                input.clear();
                stage.setScene(menuScene);
            });

            gameField.getChildren().addAll(winner, backToMenu);
        }
    }

    private boolean collide() {
        return ball.intersects(paddleOne.getBoundsInLocal()) | ball.intersects(paddleTwo.getBoundsInLocal());
    }

    private void prepareObjects() {
        paddleOne.setFill(Color.WHITE);
        paddleTwo.setFill(Color.WHITE);
        setPaddlesPosition();

        ball.setFill(Color.WHITE);
        setBallOnStart();


        scoreOne = new Text("0");
        scoreOne.setX(WIDTH/4);
        scoreOne.setY(100);
        scoreOne.setFill(Color.WHITE);
        scoreOne.setFont(Font.font(40));

        scoreTwo = new Text("0");
        scoreTwo.setX(WIDTH - WIDTH / 4);
        scoreTwo.setY(100);
        scoreTwo.setFill(Color.WHITE);
        scoreTwo.setFont(Font.font(40));

        playerOne.setFill(Color.WHITE);
        playerOne.setFont(Font.font(30));
        playerOne.setY(50);
        playerOne.setX(scoreOne.getX() - playerOne.getLayoutBounds().getWidth() / 2);

        playerTwo.setFill(Color.WHITE);
        playerTwo.setFont(Font.font(30));
        playerTwo.setY(50);
        playerTwo.setX(scoreTwo.getX() - playerTwo.getLayoutBounds().getWidth() / 2);
    }

    private void setPaddlesPosition() {
        paddleOne.setX(paddleWidth);
        paddleOne.setY(HEIGHT / 2 - paddleHeight / 2);
        paddleTwo.setX(WIDTH - 2 * paddleWidth);
        paddleTwo.setY(HEIGHT / 2 - paddleHeight / 2);
    }

    private void setBallOnStart() {
        direction = new SmartVector();

        direction.setX(direction.getX() * ballSpeed);
        direction.setY(direction.getY() * ballSpeed);

        ball.setX(WIDTH / 2 - ballEdge / 2);
        ball.setY(HEIGHT / 2 - ballEdge / 2);
    }
}
