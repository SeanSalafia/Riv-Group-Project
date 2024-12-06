import java.util.Scanner;

public class Trivia {
    boolean gameActive;
    int correct;
    int incorrect;
    int questionNumber;
    multipleChoiceQuestions mcqquestions;
    freeAnswerQuestions frquestions;
    Scanner scanner = new Scanner(System.in);
    public Trivia(){
        gameActive=false;
        correct=0;
        incorrect=0;
        questionNumber=1;
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public void start() {

        //Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to World Capitals Trivia!");
        System.out.println("Please select a game mode:");
        System.out.println("1. Easy (multiple choice)");
        System.out.println("2. Hard (free answer)");
        System.out.println("3. Exit");
        int choice=scanner.nextInt();
        scanner.nextLine();
        if(choice==1){
            mcqquestions = new multipleChoiceQuestions();
            gameActive=true;
            mcqTrivia();

        } else if(choice==2){
            frquestions = new freeAnswerQuestions();
            gameActive=true;
            freeAnswerTrivia();
        } else if(choice==3){
            gameActive=false;
        }
        else{
            System.out.println("Please select a valid option");
        }




    }
    public void mcqTrivia(){
        while (gameActive) {
            String country = mcqquestions.getRandomCountry();
            System.out.println("Question " + questionNumber + ": What is the capital of " + country + "?");
            mcqquestions.getOptions(country);
            String userAnswer = scanner.nextLine();
            if(userAnswer.equalsIgnoreCase("exit")){
                gameActive=false;
            }

            else if (mcqquestions.checkAnswer(country, userAnswer)) {
                System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
                System.out.println();
                correct++;
            } else {
                System.out.println(ANSI_RED + "Incorrect! " + ANSI_RESET + "The correct answer is " + mcqquestions.questionAnswerPairs.get(country).get(0) + ".");
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
    }
    public void freeAnswerTrivia(){
        while (gameActive) {
            String country = frquestions.getRandomCountry();
            System.out.println("Question: " + questionNumber + "What is the capital of " + country + "?");
            String userAnswer = scanner.nextLine();

            if(userAnswer.equalsIgnoreCase("exit")){
                gameActive=false;
            }
            if (frquestions.checkAnswer(country, userAnswer)) {
                System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
                System.out.println();
                correct++;
            } else {
                System.out.println(ANSI_RED + "Incorrect! " + ANSI_RESET + "The correct answer is " + frquestions.questionAnswerPairs.get(country) + ".");
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

    }

}
