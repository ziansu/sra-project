public void loadProblemsForCourse(final org.cloudcoder.app.shared.model.CourseSelection courseSelection) {
    com.google.gwt.core.client.GWT.log(("Loading problems and submission receipts for course " + (courseSelection.getCourse().getNameAndTitle())));
    org.cloudcoder.app.client.page.SessionUtil.loadProblemAndSubmissionReceiptsInCourse(page, courseSelection.getCourse(), session);
}