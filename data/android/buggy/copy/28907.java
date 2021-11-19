public void postQuestionAnonymously(java.lang.String q) {
    com.gpdisingapura.timotius.ask.model.Question question = new com.gpdisingapura.timotius.ask.model.Question(q);
    mongoOperation.save(question);
}