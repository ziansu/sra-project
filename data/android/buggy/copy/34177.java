private boolean shouldSkip(java.lang.String question, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> answerList) {
    return (question.isEmpty()) || (answerList.isEmpty());
}