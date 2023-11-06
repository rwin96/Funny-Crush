package com.example.candytesttesttest;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class StartMenu extends Application {
    private static int counter_lose_game = 1;

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        //Game scene

        StackPane startPane = new StackPane();


        //box score
        Score score = new Score();
        startPane.getChildren().add(score);
        //end

        //Heart creator
        Heart heart = new Heart();
        startPane.getChildren().add(heart);

        //background image
        Image backgroundImage = new Image(new FileInputStream("bg.jpg"));

        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, BackgroundSize.DEFAULT);

        startPane.setBackground(new Background(background));

        DokmeSaaz dokmeSaaz = new DokmeSaaz();
        startPane.getChildren().add(dokmeSaaz.getGamePane());

        Scene startScene = new Scene(startPane, 700, 700);
//        primaryStage.setTitle("Start Menu");
//        primaryStage.setScene(startScene);
//        primaryStage.show();

        //end Game scene


        //Start scene

        VBox startPane1 = new VBox(20);
        startPane1.setSpacing(100);
        startPane1.setAlignment(Pos.CENTER);
        startPane1.setPadding(new Insets(80));
        FileInputStream fileInputStream_start_scene_1 = new FileInputStream("startbg.jpg");
        Image backgroundImage_2 = new Image(fileInputStream_start_scene_1);
        BackgroundImage background_2 = new BackgroundImage(backgroundImage_2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        startPane1.setBackground(new Background(background_2));

        Text title = new Text("Candy Crush");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 85));

//        startPane1.getChildren().add(title);
//        FileInputStream fileInputStream_start_scene_1 =new FileInputStream("startbg.jpg");
//        Image image_background_scene_1 = new Image(fileInputStream_start_scene_1);
//        startPane1.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
//        new ImagePattern(image_background_scene_1)


        Button startButton = new Button();
        Image image_start_button = new Image(new FileInputStream("start.png"));
        ImageView imageView_start_button = new ImageView(image_start_button);
        imageView_start_button.setFitHeight(100);
        imageView_start_button.setFitWidth(150);
        startButton.setStyle("-fx-background-color: TRANSPARENT ; -fx-cursor: HAND");
        startButton.setGraphic(imageView_start_button);
        startButton.setOnAction(event -> {
            primaryStage.setTitle("Candy Crush :)");
            primaryStage.setScene(startScene);
            Score.reset_score();
        });
        startPane1.getChildren().add(startButton);

        Button exitButton = new Button();
        exitButton.setPadding(new Insets(-100));
        Image image_exit_button = new Image(new FileInputStream("exit_2.png"));
        ImageView imageView_exit_button = new ImageView(image_exit_button);
        imageView_exit_button.setFitHeight(110);
        imageView_exit_button.setFitWidth(160);
        exitButton.setStyle("-fx-background-color: TRANSPARENT ; -fx-cursor: HAND");
        exitButton.setGraphic(imageView_exit_button);

        exitButton.setOnAction(event -> primaryStage.close());
        startPane1.getChildren().add(exitButton);

        Scene startScene1 = new Scene(startPane1, 700, 700);


        primaryStage.setTitle("Candy Crush :)");
//        primaryStage.setScene(startScene1);


        //End Start scene


        //Press any key scene

        FileInputStream fileInputStream_key_bg = new FileInputStream("Press_any_key_bg_2.jpg");
        Image image_key_bg = new Image(fileInputStream_key_bg);
        ImageView imageView_key_bg = new ImageView(image_key_bg);
        Button button_press_any_key = new Button();
        Scene scene2 = new Scene(button_press_any_key, 700, 700);
        button_press_any_key.setStyle("-fx-cursor: HAND");
        button_press_any_key.setGraphic(imageView_key_bg);
        primaryStage.setScene(scene2);
        button_press_any_key.setOnAction(event ->
                primaryStage.setScene(startScene1));
        scene2.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() != null) {
                    primaryStage.setScene(startScene1);
                }
            }
        });
        //End press any key


        //popup scene

        StackPane gameover = new StackPane();

        Image backgroundImagePopup = new Image(new FileInputStream("bg.jpg"));

        BackgroundImage backgroundPopup = new BackgroundImage(backgroundImagePopup,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, BackgroundSize.DEFAULT);

        gameover.setBackground(new Background(backgroundPopup));

        Stage popup = new Stage();
        popup.initModality(Modality.APPLICATION_MODAL);


        Label label = new Label("Game Over !");
        label.setFont(Font.font("Arial", FontWeight.BOLD, 85));

        Button closeButton = new Button();
        closeButton.setPrefSize(200, 100);
        FileInputStream fileInputStream_game_over_play_again = new FileInputStream("play_again_2.png");
        Image image_game_over_play_again = new Image(fileInputStream_game_over_play_again);
        ImageView imageView_game_over_play_again = new ImageView(image_game_over_play_again);
        imageView_game_over_play_again.setFitWidth(200);
        imageView_game_over_play_again.setFitHeight(100);
        closeButton.setStyle("-fx-background-color: TRANSPARENT ; -fx-cursor: HAND");
        closeButton.setGraphic(imageView_game_over_play_again);
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                primaryStage.setScene(startScene1);
                DokmeSaaz.random_generate();
            }
        });

//        closeButton.setOnAction(event -> Heart.reset_lives());


        VBox vbox = new VBox(label, closeButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(80);


        gameover.getChildren().add(vbox);
        Scene popupScene = new Scene(gameover, 700, 700);


        vbox.setAlignment(Pos.CENTER);
        vbox.alignmentProperty().setValue(Pos.CENTER);
        vbox.setLayoutX(0);
        vbox.setLayoutY(0);


// Show the popup

        //Timeline
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.001), event -> {
            CheckButtons.checkForMatches3();
            CheckButtons.checkForMatches2();
            CheckButtons.checkForMatches1();
            if (Heart.get_lives() == 0) {
                try {
                    Heart.reset_lives();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                primaryStage.setScene(popupScene);

            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        //End timeline


        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}