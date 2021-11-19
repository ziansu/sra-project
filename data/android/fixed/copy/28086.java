private void createStudy() throws rifGenericLibrary.system.RIFServiceException {
    studyID = createStudySubmissionStep.performStep(connection, user, studySubmission);
    java.lang.String statusMessage = rifServices.system.RIFServiceMessages.getMessage("studyState.studyCreated.description");
    updateStudyStatusState(statusMessage);
}