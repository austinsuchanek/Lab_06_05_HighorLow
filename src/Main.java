import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randNum = new Random();
        int randomNum = randNum.nextInt(10) + 1;


        System.out.println("Welcome to the Random Number Game. We have chosen a number from 1-10 and you have to guess what our number is! Please enter your number here: ");

        Scanner scanner = new Scanner(System.in);
        int playerGuess = scanner.nextInt();

        if (playerGuess == randomNum) {
            System.out.println("You were on the money! You win!");

        } else if (randomNum > playerGuess) {
            System.out.println("Wrong! The number is higher!");
        } else {
            System.out.println("Wrong! The number is lower!");
        }
    }
}