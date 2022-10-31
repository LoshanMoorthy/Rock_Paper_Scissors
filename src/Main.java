import java.util.*;
import java.io.*;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ANSI_GREEN + "By Loshan Sundaramoorthy - Version 1" + ANSI_RESET);
        Scanner s = new Scanner(System.in);
        String playY = "Yes";
        String playN = "No";
        Random random = new Random();
        System.out.println("Do you wanna play rock, paper or scissors? [Yes or No]");
        String YorN = s.nextLine();

        while(playY.equals(YorN)) {
            System.out.println("Awesome");
            Thread.sleep(100);
            System.out.println("Choose between [Rock], [Paper] or [Scissors]");
            String RPS = s.nextLine();
            Thread.sleep(100);
            System.out.println("You choose " + RPS);

            Thread.sleep(1000);
            System.out.print("...");


            int x = random.nextInt(1,3);
            String AI;
            if(x == 1) {
                AI = "Rock";
            } else if(x == 2) {
                AI = "Paper";
            } else {
                AI = "Scissor";
            }
            System.out.println("Enemy AI choose " + AI);

            if(RPS.equals(AI)) {
                System.out.println("It's a draw!");
            } else if(whoWins(RPS, AI)) {
                System.out.println("You win!!");
            } else {
                System.out.println("You lost ;(");
            }

            System.out.println("Do you wanna play again? [Yes or No]");
            String again = s.nextLine();

            if(again.equals(playN)) {
                System.out.println("See you again next time!");
                break;
            } else if(again.equals(playY)) {
                continue;
            }
        }

        if(playN.equals(YorN)) {
            System.exit(0);
        }
    }
    static boolean whoWins(String RPS, String AI) {
        if(RPS.equals("Rock")) {
            return AI.equals("Scissors");
        } else if(RPS.equals("Paper")) {
            return AI.equals("Rock");
        } else {
            return AI.equals("Paper");
        }
    }
}