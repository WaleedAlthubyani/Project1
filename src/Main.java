import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] game= {{" "," "," "},{" "," "," "},{" "," "," "}};
        String[][] boardChoices = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        String choiceXO="O";

        Scanner input = new Scanner(System.in);
        int choice=1;


        while (choice!=0){
            board(game, boardChoices);
            choice = input.nextInt();
            if (!legalChoice(game,choice)){
                System.out.println("Please choose one of the remaining numbers on the second board");
                continue;}

            updateBoard(game, boardChoices, choice, choiceXO);
            choiceXO=chooseXO(choiceXO);

        }

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