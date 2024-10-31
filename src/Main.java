import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] game= {{" "," "," "},{" "," "," "},{" "," "," "}};
        String[][] boardChoices = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        board(game,boardChoices);

        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        updateBoard(game,boardChoices,choice,"X");
        board(game,boardChoices);

    }

    public static void updateBoard(String[][]game,String[][] boardChoices,int choice,String moveType){
        if (choice >=1 && choice<=3){
            game[0][choice-1]=moveType;
            boardChoices[0][choice-1]=" ";
        } else if (choice >=4 && choice<=6) {
            game[0][choice-4]=moveType;
            boardChoices[0][choice-4]=" ";
        } else if (choice >=7 && choice<=9) {
            game[0][choice-7]=moveType;
            boardChoices[0][choice-7]=" ";
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