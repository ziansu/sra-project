public void nextQuestion() {
    if ((quiz.getQuestions().size()) <= (currentQuestionIndex))
        throw new quiz.entities.QuizRunner.NoNextQuestionException();
    
    (currentQuestionIndex)++;
}