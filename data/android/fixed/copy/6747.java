@java.lang.Override
public void highLightCorrect() {
    mController.saveQuizScore(quizTimerTextView.getText().toString(), true);
    selectedChoice.setBackgroundColor(getResources().getColor(R.color.buttonColor));
    finishQuiz();
}