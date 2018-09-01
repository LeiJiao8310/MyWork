//Guess.java
//LEI JIAO
//ljiao
//pa2
//This program gives users three opportunities to guess a specific number.

import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.\n");
        int guess,NumberOfGus=0;
        boolean win=false;
        int aws = (int)(1+Math.random()*(10));
        Scanner input  = new Scanner(System.in);
        while(win==false){
            NumberOfGus++;
            System.out.print("Enter your "+(NumberOfGus==1?"first":(NumberOfGus==2?"second":"third"))+" guess: ");
            guess  = input.nextInt();
            if(guess==aws){
                win = true;
                System.out.print("You win!");
                System.exit(0);
            }
            else if(guess<aws){
                System.out.println("Your guess is too low.\n");
            }
            else if(guess>aws){
                System.out.println("Your guess is too high.\n");
            }
            if(NumberOfGus>=3){
                System.out.print("You lose. The number is "+aws+".");
                System.exit(0);
            }
        }
    }
}
