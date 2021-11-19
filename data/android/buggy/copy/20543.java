public void updateSessionResponseRateForDeletedStudentResponse(teammates.common.datatransfer.FeedbackResponseAttributes deletedResponse) throws teammates.common.exception.EntityDoesNotExistException, teammates.common.exception.InvalidParametersException {
    java.lang.String email = deletedResponse.giverEmail;
    java.lang.String sessionName = deletedResponse.feedbackSessionName;
    java.lang.String courseId = deletedResponse.courseId;
    if (noRemainingResponsesFromStudent(email, sessionName, courseId)) {
        deleteStudentFromRespondantList(email, sessionName, courseId);
    }
}