package com.example.candytesttesttest;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class CheckButtons {
    public static boolean matchFound = false;

    private static Button[][] buttons = DokmeSaaz.getButton();


    public static void checkForMatches1() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Button button = buttons[i][j];
                button.setPrefWidth(50);
                button.setPrefHeight(50);
                ImageView imageView = (ImageView) button.getGraphic();
                if (imageView != null) {
                    imageView.setFitWidth(50);
                    imageView.setFitHeight(50);
                }
            }
        }

        Random random = new Random();


        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 4; col++) {
                if (buttons[row][col].getGraphic() != null &&
                        buttons[row][col+1].getGraphic() != null &&
                        buttons[row][col+2].getGraphic() != null) {
                    Image image1 = ((ImageView)buttons[row][col].getGraphic()).getImage();
                    Image image2 = ((ImageView)buttons[row][col+1].getGraphic()).getImage();
                    Image image3 = ((ImageView)buttons[row][col+2].getGraphic()).getImage();
                    if (image1.equals(image2) && image2.equals(image3)) {
                        matchFound = true;
                        buttons[row][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row][col+1].setGraphic(new ImageView(getRandomImage()));
                        buttons[row][col+2].setGraphic(new ImageView(getRandomImage()));
                        Score.score_3();
                    }
                }
            }
        }

        for (int col = 0; col < 6; col++) {
            for (int row = 0; row < 4; row++) {
                if (buttons[row][col].getGraphic() != null &&
                        buttons[row+1][col].getGraphic() != null &&
                        buttons[row+2][col].getGraphic() != null) {
                    Image image1 = ((ImageView)buttons[row][col].getGraphic()).getImage();
                    Image image2 = ((ImageView)buttons[row+1][col].getGraphic()).getImage();
                    Image image3 = ((ImageView)buttons[row+2][col].getGraphic()).getImage();
                    if (image1.equals(image2) && image2.equals(image3)) {
                        matchFound = true;
                        buttons[row][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row+1][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row+2][col].setGraphic(new ImageView(getRandomImage()));
                        Score.score_3();
                    }
                }
            }
        }

    }
    public static void checkForMatches2() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Button button = buttons[i][j];
                button.setPrefWidth(50);
                button.setPrefHeight(50);
                ImageView imageView = (ImageView) button.getGraphic();
                if (imageView != null) {
                    imageView.setFitWidth(50);
                    imageView.setFitHeight(50);
                }
            }
        }

        Random random = new Random();
        matchFound = false;

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getGraphic() != null &&
                        buttons[row][col+1].getGraphic() != null &&
                        buttons[row][col+2].getGraphic() != null &&
                        buttons[row][col+3].getGraphic() != null) {
                    Image image1 = ((ImageView)buttons[row][col].getGraphic()).getImage();
                    Image image2 = ((ImageView)buttons[row][col+1].getGraphic()).getImage();
                    Image image3 = ((ImageView)buttons[row][col+2].getGraphic()).getImage();
                    Image image4 = ((ImageView)buttons[row][col+3].getGraphic()).getImage();
                    if (image1.equals(image2) && image2.equals(image3) && image3.equals(image4)) {
                        matchFound = true;
                        buttons[row][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row][col+1].setGraphic(new ImageView(getRandomImage()));
                        buttons[row][col+2].setGraphic(new ImageView(getRandomImage()));
                        buttons[row][col+3].setGraphic(new ImageView(getRandomImage()));
                        Score.score_4();
                    }
                }
            }
        }

        for (int col = 0; col < 6; col++) {
            for (int row = 0; row < 3; row++) {
                if (buttons[row][col].getGraphic() != null &&
                        buttons[row+1][col].getGraphic() != null &&
                        buttons[row+2][col].getGraphic() != null &&
                        buttons[row+3][col].getGraphic() != null) {
                    Image image1 = ((ImageView)buttons[row][col].getGraphic()).getImage();
                    Image image2 = ((ImageView)buttons[row+1][col].getGraphic()).getImage();
                    Image image3 = ((ImageView)buttons[row+2][col].getGraphic()).getImage();
                    Image image4 = ((ImageView)buttons[row+3][col].getGraphic()).getImage();
                    if (image1.equals(image2) && image2.equals(image3) && image3.equals(image4)) {
                        matchFound = true;
                        buttons[row][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row+1][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row+2][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row+3][col].setGraphic(new ImageView(getRandomImage()));
                        Score.score_4();
                    }
                }
            }
        }
    }
    public static void checkForMatches3() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Button button = buttons[i][j];
                button.setPrefWidth(50);
                button.setPrefHeight(50);
                ImageView imageView = (ImageView) button.getGraphic();
                if (imageView != null) {
                    imageView.setFitWidth(50);
                    imageView.setFitHeight(50);
                }
            }
        }

        Random random = new Random();
        matchFound = false;

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 2; col++) {
                if (buttons[row][col].getGraphic() != null &&
                        buttons[row][col+1].getGraphic() != null &&
                        buttons[row][col+2].getGraphic() != null &&
                        buttons[row][col+3].getGraphic() != null &&
                        buttons[row][col+4].getGraphic() != null) {
                    Image image1 = ((ImageView)buttons[row][col].getGraphic()).getImage();
                    Image image2 = ((ImageView)buttons[row][col+1].getGraphic()).getImage();
                    Image image3 = ((ImageView)buttons[row][col+2].getGraphic()).getImage();
                    Image image4 = ((ImageView)buttons[row][col+3].getGraphic()).getImage();
                    Image image5 = ((ImageView)buttons[row][col+4].getGraphic()).getImage();
                    if (image1.equals(image2) && image2.equals(image3) && image3.equals(image4) && image4.equals(image5)) {
                        matchFound = true;
                        buttons[row][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row][col+1].setGraphic(new ImageView(getRandomImage()));
                        buttons[row][col+2].setGraphic(new ImageView(getRandomImage()));
                        buttons[row][col+3].setGraphic(new ImageView(getRandomImage()));
                        buttons[row][col+4].setGraphic(new ImageView(getRandomImage()));
                        Score.score_5();
                    }
                }
            }
        }


        for (int col = 0; col < 6; col++) {
            for (int row = 0; row < 2; row++) {
                if (buttons[row][col].getGraphic() != null &&
                        buttons[row+1][col].getGraphic() != null &&
                        buttons[row+2][col].getGraphic() != null &&
                        buttons[row+3][col].getGraphic() != null &&
                        buttons[row+4][col].getGraphic() != null) {
                    Image image1 = ((ImageView)buttons[row][col].getGraphic()).getImage();
                    Image image2 = ((ImageView)buttons[row+1][col].getGraphic()).getImage();
                    Image image3 = ((ImageView)buttons[row+2][col].getGraphic()).getImage();
                    Image image4 = ((ImageView)buttons[row+3][col].getGraphic()).getImage();
                    Image image5 = ((ImageView)buttons[row+4][col].getGraphic()).getImage();
                    if (image1.equals(image2) && image2.equals(image3) && image3.equals(image4) && image4.equals(image5)) {
                        matchFound = true;
                        buttons[row][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row+1][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row+2][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row+3][col].setGraphic(new ImageView(getRandomImage()));
                        buttons[row+4][col].setGraphic(new ImageView(getRandomImage()));
                        Score.score_5();
                    }
                }
            }
        }
    }

    public static Image getRandomImage() {
        Random random = new Random();
        int imageNumber = random.nextInt(5) + 1;
        return switch (imageNumber) {
            case 1 -> DokmeSaaz.image1;
            case 2 -> DokmeSaaz.image2;
            case 3 -> DokmeSaaz.image3;
            case 4 -> DokmeSaaz.image4;
            case 5 -> DokmeSaaz.image5;
            default -> DokmeSaaz.image1;
        };
    }
}