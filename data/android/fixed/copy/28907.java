public void postQuestionAnonymously(java.lang.String title, java.lang.String q) {
    com.gpdisingapura.timotius.ask.model.Question question = new com.gpdisingapura.timotius.ask.model.Question(title, q);
    mongoOperation.save(question);
}