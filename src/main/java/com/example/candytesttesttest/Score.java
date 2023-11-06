package com.example.candytesttesttest;

import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Score extends StackPane {
    public static int score = 0;

    public static Text Score_Text;
    public Score(){
        Score_box();
    }

    public void Score_box(){

        Score_Text = new Text(null);
        Score_Text.setText(String.valueOf(score));
        Rectangle rect = new Rectangle(100, 60, Color.TRANSPARENT);
        rect.setStroke(Color.BLACK);


//        button.setStyle("-fx-background-color: transparent; -fx-background-radius: 0; -fx-cursor: HAND;");
        Score_Text.setStyle("-fx-font-size: 50 ; -fx-translate-x: -40 ; -fx-translate-y: 5 ; -fx-text-alignment: center");
        Score_Text.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        Score_Text.setTextOrigin(VPos.CENTER);
        this.setAlignment(Pos.TOP_RIGHT);
        this.setTranslateX(-50);
        this.setTranslateY(50);



        this.getChildren().addAll(/*rect,*/Score_Text);

    }

    public static void score_3(){
        score += 3;
        Score.update_score_box();
    }

    public static void score_4(){
        score += 6;
        Score.update_score_box();
    }

    public static void score_5(){
        score += 9;
        Score.update_score_box();
    }

    public static void reset_score(){
        score = 0;
        Score.update_score_box();
    }

    public static void Extra_heart(){
        if(score >= 100)
        {
            score -= 100;
            com.example.candytesttesttest.Heart.increaseLives();
        }
        Score.update_score_box();
    }

    public static void update_score_box(){
        Score_Text.setText(String.valueOf(score));
    }

}
