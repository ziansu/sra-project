@java.lang.Override
public void onClick(android.view.View v) {
    CheckAnswer();
    curQ = (curQ) + 1;
    cDown.cancel();
    QuestionEngine();
}