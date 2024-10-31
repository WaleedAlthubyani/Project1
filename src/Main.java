public class Main {
    public static void main(String[] args) {
        String[][] game= {{" "," "," "},{" "," "," "},{" "," "," "}};
        String[][] boardChoices = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        board(game,boardChoices);



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