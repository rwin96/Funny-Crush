package com.example.candytesttesttest;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Heart extends HBox {
    private static ImageView heart1;
    private static ImageView heart2;
    private static ImageView heart3;
    private static int lives = 3;

    public Heart() throws FileNotFoundException {
        // Initialize the hearts with 3 lives

        // Load the heart images
        Image heartImage = new Image(new FileInputStream("Heart_2.png"));
//        Image emptyHeartImage = new Image(new FileInputStream("Broken_heart_3.png"));

        // Create the heart ImageView objects
        heart1 = new ImageView(heartImage);
        heart2 = new ImageView(heartImage);
        heart3 = new ImageView(heartImage);

        // Set the size of the hearts
        heart1.setFitWidth(50);
        heart1.setFitHeight(50);
        heart2.setFitWidth(50);
        heart2.setFitHeight(50);
        heart3.setFitWidth(50);
        heart3.setFitHeight(50);

        // Add the hearts to the HBox
        this.getChildren().addAll(heart1, heart2, heart3);

        this.setTranslateX(50);
        this.setTranslateY(50);

        // Set the spacing and alignment of the HBox
        this.setSpacing(5);
        this.setAlignment(Pos.TOP_LEFT);
        this.setPadding(new Insets(10));

        // Set the hearts to be visible
        heart1.setVisible(true);
        heart2.setVisible(true);
        heart3.setVisible(true);

    }

    // Decrease the number of lives by 1 and update the hearts
    public static void decreaseLives() {
        if (lives > 0) {
            lives--;
        }
        try {
            updateHearts();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    //increase lives
    public static void increaseLives() {
        if (lives < 3) {
            lives++;
        }
        try {
            updateHearts();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Update the hearts based on the current number of lives
    private static void updateHearts() throws FileNotFoundException {
        if (lives == 3) {
            heart1.setImage(new Image(new FileInputStream("Heart_2.png")));
            heart2.setImage(new Image(new FileInputStream("Heart_2.png")));
            heart3.setImage(new Image(new FileInputStream("Heart_2.png")));
        } else if (lives == 2) {
            heart1.setImage(new Image(new FileInputStream("Heart_2.png")));
            heart2.setImage(new Image(new FileInputStream("Heart_2.png")));
            heart3.setImage(new Image(new FileInputStream("Broken_heart_3.png")));
        } else if (lives == 1) {
            heart1.setImage(new Image(new FileInputStream("Heart_2.png")));
            heart2.setImage(new Image(new FileInputStream("Broken_heart_3.png")));
            heart3.setImage(new Image(new FileInputStream("Broken_heart_3.png")));
        } else {
            heart1.setImage(new Image(new FileInputStream("Broken_heart_3.png")));
            heart2.setImage(new Image(new FileInputStream("Broken_heart_3.png")));
            heart3.setImage(new Image(new FileInputStream("Broken_heart_3.png")));
        }
    }

    public static int get_lives(){
        return lives;
    }
    public static void reset_lives() throws FileNotFoundException {
        lives = 3;
        updateHearts();
    }
}