package com.example.goober.fruitmachine;

import java.util.Scanner;

import static android.R.attr.key;
import static android.R.id.input;

/**
 * Created by goober on 05/11/2017.
 */

public class Runner {

    public static void main(String[] args) {

        System.out.println("Please select number of reels 3 or 5");
        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        int reels = Integer.parseInt(input);
        FruitMachine puggy = new FruitMachine("Colossus", reels, 1000);
        System.out.println("Welcome to Colossus. How much do you want to spend?");
        String spend = scanner.nextLine();
        int funds = Integer.parseInt(spend);

        Player player = new Player("Mug", funds);

        System.out.println("Hi " + player.name + " You have £" + funds +" to spend, press S to spin and good luck!!!");

        while ((puggy.getFunds() > 0) && (player.getFunds() > 0)){
            Scanner spin  = new Scanner( System.in );
            String key = spin.nextLine();
            if (key.equals("s") ){
                player.reduceFunds();
                System.out.println(puggy.result(puggy.winCheck(puggy.spin())));
                player.addFunds(puggy.winValue);
                System.out.println("Current funds are £" + player.getFunds() + " press s to continue");

                if (player.getFunds() == 0){
                    System.out.println("I'm sorry " + player.name + " you are out of funds. Add funds or press e to exit");
                    Scanner choice  = new Scanner( System.in );
                    String decision = spin.nextLine();
                    if (decision.equals("e") || decision.equals("s")){
                        System.out.println("Bye Bye....");
                        break;
                    }
                    else {
                        int newAmount = Integer.parseInt(decision);
                        player.addFunds(newAmount);
                        System.out.println("You now have £" + player.getFunds() + " to spend, press S to continue....");
                    }
                }
            }
            else {
                System.out.println("OOPS that wasn't S......");
                System.exit(0);
            }

        }


    }
}
