private boolean makeExamTestChanges() {
    boolean success;
    if (mIsNewQuestion) {
        success = addQuestion();
        mQuestionCursor.next();
    }else {
        success = editCurrentQuestion();
    }
    mIsNewQuestion = false;
    return success;
}