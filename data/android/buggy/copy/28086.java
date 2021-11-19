private void createStudy() throws rifGenericLibrary.system.RIFServiceException {
    java.lang.System.out.println("CREATE STUDY =====================================START =============================");
    studyID = createStudySubmissionStep.performStep(connection, user, studySubmission);
    java.lang.String statusMessage = rifServices.system.RIFServiceMessages.getMessage("studyState.studyCreated.description");
    updateStudyStatusState(statusMessage);
    java.lang.System.out.println("CREATE STUDY =====================================END =============================");
}