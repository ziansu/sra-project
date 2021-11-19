private int getQuestion3Result() {
    if (question3Answer.getText().toString().equals(QUESTION_3_RIGHT_RESULT)) {
        return 2;
    }
    return 0;
}