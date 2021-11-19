private boolean makeExamTestChanges() {
    boolean success;
    if (mIsNewQuestion) {
        success = addQuestion();
        if (success) {
            mQuestionCursor.next();
        }
    }else {
        success = editCurrentQuestion();
    }
    mIsNewQuestion = false;
    return success;
}