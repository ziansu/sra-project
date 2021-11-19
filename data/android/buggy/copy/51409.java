public void delete(com.zynap.talentstudio.questionnaires.QuestionnaireWorkflow questionnaireWorkflow) throws com.zynap.exception.TalentStudioException {
    closeWorkflowProcess(questionnaireWorkflow);
    com.zynap.talentstudio.questionnaires.QuestionnaireWorkflow queWorkflow = questionnaireDao.findById(questionnaireWorkflow.getId());
    questionnaireDao.mergeDelete(queWorkflow);
}