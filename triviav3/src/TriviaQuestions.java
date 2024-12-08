public interface TriviaQuestions{
    void populateQuestionAnswerPairs();
    String getRandomCountry();
    boolean checkAnswer(String country, String userAnswer);


}
