private void updateStudyStatusState(final java.lang.String statusMessage) throws rifGenericLibrary.system.RIFServiceException {
    studyStateMachine.next();
    rifServices.businessConceptLayer.StudyState currentStudyState = studyStateMachine.next();
    studyStateManager.updateStudyStatus(connection, user, studyID, currentStudyState, statusMessage);
}