public void postQuestion(java.lang.String postedBy, java.lang.String q) {
    com.gpdisingapura.timotius.ask.model.Question question = new com.gpdisingapura.timotius.ask.model.Question(q, postedBy);
    mongoOperation.save(question);
}