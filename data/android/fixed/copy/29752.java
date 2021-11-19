public void addUserAnswer(int questionNum, java.lang.String answer) {
    if ((quizzes.MultiplePageQuiz.userAnswers) != null)
        quizzes.MultiplePageQuiz.userAnswers.put(questionNum, answer);
    
}