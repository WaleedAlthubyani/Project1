import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] game= {{" "," "," "},{" "," "," "},{" "," "," "}};
        String[][] boardChoices = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        String choiceXO="O";

        Scanner input = new Scanner(System.in);
        int choice=1;
        int counter=0;


        while (choice!=0){
            board(game, boardChoices);
            choice = input.nextInt();

            if (!legalChoice(game,choice)){
                System.out.println("Please choose one of the remaining numbers on the second board");
                continue;}

            updateBoard(game, boardChoices, choice, choiceXO);

            if (checkWin(game)){
                board(game, boardChoices);
                System.out.println("Player "+ choiceXO + " wins");
                break;}

            choiceXO=chooseXO(choiceXO);

            counter++;
            if (counter==9){
                board(game, boardChoices);
                System.out.println("Draw");
                break;
            }
        }

    }



    public static boolean checkWin(String[][] gameBoard){
        boolean win=false;

        if (gameBoard[0][0].equals(gameBoard[0][1]) && gameBoard[0][0].equals(gameBoard[0][2])){
            if (gameBoard[0][0].equals("O") || gameBoard[0][0].equals("X"))
                win = true;
        }else if (gameBoard[1][0].equals(gameBoard[1][1]) && gameBoard[1][0].equals(gameBoard[1][2])){
            if (gameBoard[1][0].equals("O") || gameBoard[1][0].equals("X"))
                win = true;
        }else if (gameBoard[2][0].equals(gameBoard[2][1]) && gameBoard[2][0].equals(gameBoard[2][2])){
            if (gameBoard[2][0].equals("O") || gameBoard[2][0].equals("X"))
                win = true;
        }else if (gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[0][0].equals(gameBoard[2][2])){
            if (gameBoard[0][0].equals("O") || gameBoard[0][0].equals("X"))
                win = true;
        }else if (gameBoard[0][2].equals(gameBoard[1][1]) && gameBoard[0][2].equals(gameBoard[2][0])){
            if (gameBoard[0][2].equals("O") || gameBoard[0][2].equals("X"))
                win = true;
        }else if (gameBoard[0][0].equals(gameBoard[1][0]) && gameBoard[0][0].equals(gameBoard[2][0])){
            if (gameBoard[0][0].equals("O") || gameBoard[0][0].equals("X"))
                win = true;
        }else if (gameBoard[0][1].equals(gameBoard[1][1]) && gameBoard[0][1].equals(gameBoard[2][1])){
            if (gameBoard[0][1].equals("O") || gameBoard[0][1].equals("X"))
                win = true;
        }else if (gameBoard[0][2].equals(gameBoard[1][2]) && gameBoard[0][2].equals(gameBoard[2][2])){
            if (gameBoard[0][0].equals("O") || gameBoard[0][0].equals("X"))
                win = true;
        }

            return win;
    }

    public static String chooseXO(String choiceXO){
        if (choiceXO.equals("O"))
            return "X";
        else
            return "O";
    }

    public static boolean legalChoice(String[][]game,int choice){
        boolean legalMove = false;
        if (choice >=1 && choice<=3){
            if (game[0][choice-1].equals(" "))
                legalMove=true;
        } else if (choice >=4 && choice<=6) {
            System.out.println(choice);
            if (game[1][choice-4].equals(" "))
                legalMove=true;
        } else if (choice >=7 && choice<=9) {
            if (game[2][choice-7].equals(" "))
                legalMove=true;
        }

        return legalMove;
    }

    public static void updateBoard(String[][]game,String[][] boardChoices,int choice,String moveType){
        if (choice >=1 && choice<=3){
            game[0][choice-1]=moveType;
            boardChoices[0][choice-1]=" ";
        } else if (choice >=4 && choice<=6) {
            game[1][choice-4]=moveType;
            boardChoices[1][choice-4]=" ";
        } else if (choice >=7 && choice<=9) {
            game[2][choice-7]=moveType;
            boardChoices[2][choice-7]=" ";
        }

    }

    public static void board(String[][] game,String[][] boardChoices){

        System.out.println("  +---+---+---+"+"     Choose a number     "+"+---+---+---+");
        System.out.println("  | " + game[0][0]+" | "+game[0][1]+" | "+game[0][2]+" |"+"                         "+"| " + boardChoices[0][0]+" | "+boardChoices[0][1]+" | "+boardChoices[0][2]+" |");
        System.out.println("  +---+---+---+"+"                         "+"+---+---+---+");
        System.out.println("  | " + game[1][0]+" | "+game[1][1]+" | "+game[1][2]+" |"+"          <===>          "+"| " + boardChoices[1][0]+" | "+boardChoices[1][1]+" | "+boardChoices[1][2]+" |");
        System.out.println("  +---+---+---+"+"                         "+"+---+---+---+");
        System.out.println("  | " + game[2][0]+" | "+game[2][1]+" | "+game[2][2]+" |"+"                         "+"| " + boardChoices[2][0]+" | "+boardChoices[2][1]+" | "+boardChoices[2][2]+" |");
        System.out.println("  +---+---+---+"+"                         "+"+---+---+---+");

    }
}