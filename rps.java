import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            String p1,p2, ch;
            System.out.println("Rock Papers Scissors Game");
            System.out.println("DO YOU WANT TO PLAY ?");
            ch = s.nextLine();
            if(ch == "n" || ch =="N")
                break;
            
            System.out.println("Player 1 : ");
            p1 = s.nextLine();
            
            System.out.println("Player 2 : ");
            p2 = s.nextLine();

            if (p1 == "rock" && p2 == "paper") {
                System.out.println("player 1 , rock wins !");
            }
            else if (p1 == "paper" || p2 == "scissor") {
                System.out.println("P2, Scissor wins");
            }
            else
            {
                System.out.println("idegaf who won");
            }
        }

        s.close();
    }
}
