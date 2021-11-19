public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getAllStudentByCourseId(java.lang.String courseId, boolean useDraft) {
    if (useDraft == true) {
        return courseUtil.findAllStudentWithGradeDraftByCourseId(courseId);
    }else {
        return courseUtil.findAllStudentWithGradeByCourseId(courseId);
    }
}