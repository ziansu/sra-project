protected java.util.List<teammates.common.datatransfer.attributes.FeedbackSessionAttributes> loadFeedbackSessionsList(java.util.List<teammates.common.datatransfer.attributes.InstructorAttributes> instructorList) {
    java.util.List<teammates.common.datatransfer.attributes.FeedbackSessionAttributes> sessions = logic.getFeedbackSessionsListForInstructor(instructorList);
    return sessions;
}