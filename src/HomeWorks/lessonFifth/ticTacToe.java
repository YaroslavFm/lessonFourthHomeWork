package HomeWorks.lessonFifth;

import java.util.EmptyStackException;
import java.util.Scanner;

public class ticTacToe {

    public static final String EMPTY = "   ";
    public static final String X = " X ";
    public static final String O = " O ";
    public static String activeGamer;

    public static final int Ranges = 3;
    public static final int Columns = 3;
    public static String [][] GameField = new String [Ranges] [Columns];
    public static int GameStatus;
    public static final int GameIsOn = 0;
    public static final int StatusDraw = 1;
    public static final int StatusWinnerX = 3;
    public static final int StatusWinnerO = 4;

    public static Scanner in = new Scanner (System.in);


    public static void main(String[] args) {
        startGame();
        do {
            getSymbolFromGamer();
            analyzeGame();
            showGame();
            if (GameStatus == StatusWinnerX){
                System.out.println("'X' победил");
            }
            else if (GameStatus == StatusWinnerO){
                System.out.println("'O' победил");
            }
            else if (GameStatus == StatusDraw){
                System.out.println("ничья");
            }
            activeGamer = (activeGamer == X ? O : X);
        }
        while (GameStatus == GameIsOn);

    }

    public static void startGame () {
        for (int range = 0; range < Ranges; range++){
            for (int column = 0; column < Columns; column++){
                GameField[range][column] = EMPTY;
            }
        }
        activeGamer = X;
        showGame();
    }

    public static void getSymbolFromGamer () {

        boolean inputRight = false;
        do {
            System.out.println("Игрок '"+activeGamer+"', введите ряд (1-3) и столбец (1-3) через пробел");
            int range = in.nextInt()-1;
            int column = in.nextInt()-1;
            if (range>=0 && range<Ranges && column>=0 && column<Columns && GameField[range][column] == EMPTY){
                GameField[range][column] = activeGamer;
                inputRight = true;
            }
            else {
                System.out.println("Выбранное место (" + (range+1) + "," + (column+1)
                        + ") не может быть использована. Попробуйт еще раз...");
            }
        }
        while (inputRight!=true);
    }

    public static void analyzeGame () {
        String vinner = findWinner();
        if (vinner.equals(X)){
            GameStatus = StatusWinnerX;
        }
        else if (vinner.equals(O)){
            GameStatus = StatusWinnerO;
        }
        else if (allPlacesAreFull()){
            GameStatus = StatusDraw;
        }
        else {
            GameStatus = GameIsOn;
        }
    }

    public static boolean allPlacesAreFull () {
        for (int range = 0; range < Ranges; range++){
            for (int column = 0; column < Columns; column++){
                if (GameField [range][column] == EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    public static String findWinner () {
        int sameElements;
        for (int range = 0; range<Ranges; range++){
            sameElements = 0;
            for (int column = 0; column<Columns; column++){
                if (GameField[range][0] != EMPTY && GameField[range][0] == GameField[range][column]){
                    sameElements++;
                }
            }
            if (sameElements==3){
                return GameField[range][0];
            }
        }
        for (int column = 0; column<Columns; column++){
            sameElements = 0;
            for (int range = 0; range<Ranges; range++){
                if (GameField[0][column] != EMPTY && GameField[0][column] == GameField[range][column]){
                    sameElements++;
                }
            }
            if (sameElements==3){
                return GameField[column][0];
            }
        }
        if (GameField [0][0]!= EMPTY && GameField [0][0] == GameField [1][1] && GameField [0][0] == GameField [2][2]){
            return GameField [0][0];
        }
        if (GameField [0][2]!= EMPTY && GameField [0][2] == GameField [1][1] && GameField [0][2] == GameField [2][0]){
            return GameField [0][2];
        }
        return EMPTY;
    }

    public static void showGame () {
        for (int range = 0; range < Ranges; range++) {
            for (int column = 0; column < Columns; column++){
                System.out.print(GameField [range][column]);
                if (column!=Columns-1){
                    System.out.print("|");
                }

            }
            System.out.println();
            if (range!=Ranges-1){
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

}

