package com.example.candytesttesttest;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class DokmeSaaz {
    private GridPane gamePane;
    public static Button[][] buttons;

    public static FileInputStream fileInputStream1;

    static {
        try {
            fileInputStream1 = new FileInputStream("Misagh.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static FileInputStream fileInputStream2;

    static {
        try {
            fileInputStream2 = new FileInputStream("Amir.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static FileInputStream fileInputStream3;

    static {
        try {
            fileInputStream3 = new FileInputStream("Tooraj.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static FileInputStream fileInputStream4;

    static {
        try {
            fileInputStream4 = new FileInputStream("Arshia.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static FileInputStream fileInputStream5;

    static {
        try {
            fileInputStream5 = new FileInputStream("Mahdi.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Image image1 = new Image(fileInputStream1);
    public static Image image2 = new Image(fileInputStream2);
    public static Image image3 = new Image(fileInputStream3);
    public static Image image4 = new Image(fileInputStream4);
    public static Image image5 = new Image(fileInputStream5);

    public static ImageView imageView1 = new ImageView(image1);
    public static ImageView imageView2 = new ImageView(image2);
    public static ImageView imageView3 = new ImageView(image3);
    public static ImageView imageView4 = new ImageView(image4);
    public static ImageView imageView5 = new ImageView(image5);


    public DokmeSaaz() {
        buttons = new Button[6][6];
        Random random = new Random();
        gamePane = new GridPane();

        int rnd_number;
        imageView1.setFitHeight(50);
        imageView1.setFitWidth(50);

        imageView2.setFitHeight(50);
        imageView2.setFitWidth(50);

        imageView3.setFitHeight(50);
        imageView3.setFitWidth(50);

        imageView4.setFitHeight(50);
        imageView4.setFitWidth(50);

        imageView5.setFitHeight(50);
        imageView5.setFitWidth(50);

        for (int i = 0; i < 36; i++) {
            rnd_number = random.nextInt(5)+1;
            Button button = new Button();
            button.setStyle("-fx-background-color: transparent; -fx-background-radius: 0; -fx-cursor: HAND;");
            button.setPrefSize(50, 50);

            ImageView imageView = null;

            switch (rnd_number) {
                case 1:
                    imageView = new ImageView(image1);
                    break;
                case 2:
                    imageView = new ImageView(image2);
                    break;
                case 3:
                    imageView = new ImageView(image3);
                    break;
                case 4:
                    imageView = new ImageView(image4);
                    break;
                case 5:
                    imageView = new ImageView(image5);
                    break;
            }

            imageView.setFitHeight(50);
            imageView.setFitWidth(50);
            button.setGraphic(imageView);
            button.setOnMouseEntered(e -> {
                button.setScaleX(1.3);
                button.setScaleY(1.3);
            });
            button.setOnMouseExited(e -> {
                button.setScaleX(1.0);
                button.setScaleY(1.0);
            });
            gamePane.add(button, i % 6, i / 6);
            buttons[i % 6][i / 6] = button;
        }
        gamePane.alignmentProperty().setValue(Pos.CENTER);
        gamePane.setTranslateY(30);

        for (int i = 0; i < 36; i++) {
            Button button = buttons[i % 6][i / 6];
            button.setOnAction(e -> {
                com.example.candytesttesttest.ImageSwitcher imageSwitcher = new com.example.candytesttesttest.ImageSwitcher(buttons);
//                CheckButtons.checkForMatches();
                // نمایش امتیاز جدید در UI
            });
        }

    }

    public GridPane getGamePane() {
        return gamePane;
    }

    public static void random_generate()
    {
        for (int i=0 ; i<6 ; i++)
            for (int j=0 ; j<6 ; j++)
                buttons[i][j].setGraphic(new ImageView(com.example.candytesttesttest.CheckButtons.getRandomImage()));
    }

    public static Button[][] getButton()
    {
        return buttons;
    }

}