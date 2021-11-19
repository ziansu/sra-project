public tds.exam.OpenExamRequest build() {
    return new tds.exam.OpenExamRequest.Builder().withStudentId(studentId).withAssessmentKey(assessmentKey).withSessionId(sessionId).withGuestAccommodations(guestAccommodations).withBrowserId(browserId).build();
}