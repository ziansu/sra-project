public void copySurvey(java.lang.String quizzId) throws com.stratelia.webactiv.quizz.QuizzException, org.silverpeas.util.clipboard.ClipboardException {
    com.stratelia.webactiv.questionContainer.model.QuestionContainerDetail quizz = getQuizzDetail(quizzId);
    com.stratelia.webactiv.questionContainer.model.QuestionContainerSelection questionContainerSelect = new com.stratelia.webactiv.questionContainer.model.QuestionContainerSelection(quizz);
    getClipboardObjects().add(questionContainerSelect);
}