import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Questions questions = new Questions();


        int correct = 0;
        int incorrect = 0;



        boolean gameActive = true;



        System.out.println("Welcome to a World Capital Trivia Game!");
        System.out.println("In this game, you are given a country name.");
        System.out.println("You are tasked with answering 20 random questions!");
        System.out.println("Good Luck!");

        while (gameActive) {
            System.out.println("What is the capital of " + questions.getRandomCountry());





        }

    }
}