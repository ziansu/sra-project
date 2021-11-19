@org.junit.Test(expected = QuizRunner.NoNextQuestionException.class)
public void nextQuestionShouldThrowAnExceptionWhenThereAreNoMoreQuestions() {
    quiz.entities.QuizRunner runner = new quiz.entities.QuizRunner(new quiz.entities.QuizRunnerTest.FakeQuizWithOnlyOneQuestion(), new quiz.entities.RandomAnswersChooser(new quiz.entities.QuizRunnerTest.FakeRandomNumberGenerator()));
    runner.nextQuestion();
    runner.nextQuestion();
}