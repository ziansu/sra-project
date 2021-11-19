private void updatePrevQuestionContent() {
    int index = ((mCurrentIndex) - 1) % (mQuestions.length);
    if (index < 0) {
        index += mQuestions.length;
    }
    updateQuestionContent(index);
}