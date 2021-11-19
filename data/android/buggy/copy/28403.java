void setQuestionToAnswered(java.lang.String id, boolean answered) {
    java.lang.Long lQuestionId = java.lang.Long.getLong(id);
    questionRepository.updateAnswered(lQuestionId, answered);
}