@java.lang.Override
public void quizResultDialogConfirm() {
    presenter.playNextQuiz();
    quizResultDialog.dismiss();
    isDialogShown = false;
    showAndroidKeyboard();
}