import java.util.Scanner;


public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    //   public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    //   public static final String ANSI_YELLOW = "\u001B[33m";
    //   public static final String ANSI_BLUE = "\u001B[34m";
    //   public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    //   public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MultipleChoiceQuestions questions = new MultipleChoiceQuestions();

        int correct=0;
        int incorrect=0;
        int questionNumber=1;


        boolean gameActive = true;


        System.out.println("Welcome to a World Capital Trivia Game!");
        System.out.println("In this game, you are given a country name.");
        System.out.println("You are tasked with answering 20 random questions!");
        System.out.println("Good Luck!");
        System.out.println("-----------------------------------------------------------");

        while (gameActive) {
            String country = questions.getRandomCountry();
            System.out.println("Question " + questionNumber + ": What is the capital of " + country + "?");
            questions.getOptions(country);
            String userAnswer = scanner.nextLine();


            if (questions.checkAnswer(country, userAnswer)) {
                System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
                System.out.println();
                correct++;
            } else {
                System.out.println(ANSI_RED + "Incorrect! " + ANSI_RESET + "The correct answer is " + questions.questionAnswerPairs.get(country).get(0) + ".");
                System.out.println();
                incorrect++;
            }
            questionNumber++;

            // End game after 20 questions
            if (correct + incorrect >= 20) {
                System.out.println(ANSI_CYAN + "Game Over! You answered " + correct + " correctly and " + incorrect + " incorrectly." + ANSI_RESET);
                gameActive = false;
            }

        }
    }}