package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winner = "";
        switch (handSign){

            case "rock":
                winner = "paper";
                break;
            case "paper":
                winner =  "scissor";
                break;
            case "scissor":
                winner =  "rock";
                break;
        }


        return winner;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String loser = "";
        switch (handSign) {

            case "rock":
                loser = "scissor";
                break;
            case "paper":
                loser = "rock";
                break;
            case "scissor":
                loser = "paper";
                break;


        }
        return loser;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        getWinningMove(handSignOfPlayer1);

        if (handSignOfPlayer1.contains(getWinningMove(handSignOfPlayer2))) {
            return handSignOfPlayer1;
        }
        else if(handSignOfPlayer2.contains(getWinningMove(handSignOfPlayer1))){
            return handSignOfPlayer2;
        }
        else {return "tie";}

    }
}
