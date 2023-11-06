package com.example.candytesttesttest;

import javafx.animation.FadeTransition;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class ImageSwitcher {

    private Button[][] buttons;
    private int check = 0;
    private Button lastClickedButton = null;
    private Button firstClickedButton = null;

    public ImageSwitcher(Button[][] buttons) {
        this.buttons = buttons;
        setButtonActions();
    }

    private void setButtonActions() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                Button button = buttons[i][j];
                button.setOnAction(event -> {
                    int row = GridPane.getRowIndex(button);
                    int col = GridPane.getColumnIndex(button);

                    if (firstClickedButton == null) {
                        firstClickedButton = button;
                    } else {
                        lastClickedButton = button;

                        if (col < 5 && buttons[col + 1][row] == firstClickedButton) {
                            switchImages(firstClickedButton, lastClickedButton);
                        } else if (col > 0 && buttons[col - 1][row] == firstClickedButton) {
                            switchImages(firstClickedButton, lastClickedButton);
                        } else if (row < 5 && buttons[col][row + 1] == firstClickedButton) {
                            switchImages(firstClickedButton, lastClickedButton);
                        } else if (row > 0 && buttons[col][row - 1] == firstClickedButton) {
                            switchImages(firstClickedButton, lastClickedButton);
                        }
                        firstClickedButton = null;
                        lastClickedButton = null;
                    }
                });
            }
        }
    }

    private void switchImages2(Button button12, Button button22) {
        int row12 = GridPane.getRowIndex(button12);
        int col12 = GridPane.getColumnIndex(button12);
        int row22 = GridPane.getRowIndex(button22);
        int col22 = GridPane.getColumnIndex(button22);


        ImageView imageView12 = (ImageView) button12.getGraphic();
        ImageView imageView22 = (ImageView) button22.getGraphic();

        if (imageView12 != null && imageView22 != null) {
            Image tempImage = imageView12.getImage();
            imageView12.setImage(imageView22.getImage());
            imageView22.setImage(tempImage);
        }
    }

    private void switchImages (Button button1, Button button2){
        int row1 = GridPane.getRowIndex(button1);
        int col1 = GridPane.getColumnIndex(button1);
        int row2 = GridPane.getRowIndex(button2);
        int col2 = GridPane.getColumnIndex(button2);

        ImageView imageView1 = (ImageView) button1.getGraphic();
        ImageView imageView2 = (ImageView) button2.getGraphic();

        if (imageView1 != null && imageView2 != null) {
            Image tempImage = imageView1.getImage();
            imageView1.setImage(imageView2.getImage());
            imageView2.setImage(tempImage);
        }

        com.example.candytesttesttest.CheckButtons.checkForMatches3();
        if (com.example.candytesttesttest.CheckButtons.matchFound) {
            Heart.increaseLives();
            Score.score_5();
            check = 5;
        }

        com.example.candytesttesttest.CheckButtons.checkForMatches2();
        if(com.example.candytesttesttest.CheckButtons.matchFound && check != 5)
        {
            Score.score_4();
            check = 4;
        }

        com.example.candytesttesttest.CheckButtons.checkForMatches1();
        if (!com.example.candytesttesttest.CheckButtons.matchFound) {
            Heart.decreaseLives();
            switchImages2(button1,button2);
        }
        if(com.example.candytesttesttest.CheckButtons.matchFound && check != 5 && check != 4)
        {
            Score.score_3();
            check = 0;
        }
    }

}