package com.wandercoder;

import com.wandercoder.controller.ScoreBoard;
import com.wandercoder.model.Balloon;
import com.wandercoder.model.Clown;
import com.wandercoder.model.SquareBalloon;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.print("Baloon Tap Score: ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown Tap score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon Tap score: ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
