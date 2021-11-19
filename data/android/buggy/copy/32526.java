public tds.exam.OpenExamRequest build() {
    return new tds.exam.OpenExamRequest.Builder().withStudentId(studentId).withAssessmentKey(assessmentKey).withMaxAttempts(maxAttempts).withSessionId(sessionId).withGuestAccommodations(guestAccommodations).withBrowserId(browserId).build();
}