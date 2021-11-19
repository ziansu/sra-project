private void resetQuestionActivity() {
    questions = new java.util.ArrayList(dbAdapter.getAllQuestionsByDifficulty(((getDifficulty()) - 1)));
    setContentView(R.layout.activity_question);
    currentQuestion = 0;
    numberOfRightAnswers = 0;
    setupQuestionActicity();
}