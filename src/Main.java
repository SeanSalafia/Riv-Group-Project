import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Questions questions = new Questions();


        int correct = 0;
        int incorrect = 0;
        int questionNumber = 0;


        boolean gameActive = true;


        System.out.println("Welcome to a World Capital Trivia Game!");
        System.out.println("In this game, you are given a country name.");
        System.out.println("You are tasked with answering 20 random questions!");
        System.out.println("Good Luck!");
        System.out.println("-----------------------------------------------------------");

        while (gameActive) {
            String country = questions.getRandomCountry();
            System.out.println("What is the capital of " + country + "?");
            String userAnswer = scanner.nextLine();

            if (questions.checkAnswer(country, userAnswer)) {
                System.out.println("Correct!");
                System.out.println();
                correct++;
            } else {
                System.out.println("Incorrect! The correct answer is " + questions.questionAnswerPairs.get(country) + ".");
                System.out.println();
                incorrect++;
            }

            // End game after 20 questions
            if (correct + incorrect >= 20) {
                System.out.println("Game Over! You answered " + correct + " correctly and " + incorrect + " incorrectly.");
                gameActive = false;
            }
        }
    }
}