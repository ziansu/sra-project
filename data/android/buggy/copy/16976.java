@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = (mCurrentIndex) - 1;
    if ((mCurrentIndex) < 0) {
        mCurrentIndex = (mQuestionBank.length) - 1;
    }
    updateQuestion();
}