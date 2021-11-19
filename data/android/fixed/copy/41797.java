public void updateQuestions(java.lang.String login, java.util.List<java.lang.String> questions) {
    if (login != null) {
        studentQuestions.put(login, questions);
    }
    for (java.lang.String q : questions) {
        incrementQuestion(q);
    }
}