// guess the number

import java.util.Random;
import java.util.Scanner;

public class Game {
    public int randomNumber;
    public int user;
    public static int noOfGuesses;

    Game(){
        System.out.println("Enter a number: ");
        Scanner oj1 = new Scanner(System.in);
        user = oj1.nextInt();
        Random obj2 = new Random();
        int n = 5;
        randomNumber = obj2.nextInt(n);
    }

    public boolean check(){
        noOfGuesses++;
        return user == randomNumber;
    }

    public static void main(String args[]){
        noOfGuesses = 0;
        while (true) {
            Game ob1 = new Game();
            if (ob1.check()) {
                System.out.println("Your guess is correct");
                System.out.println("Total guesses = " + noOfGuesses);
                break;
            } else if (ob1.randomNumber > 2 && ob1.randomNumber < 6) {
                System.out.println("Try between 2 and 6");
            } else {
                System.out.println("Try again");

            }
        }
    }
}
