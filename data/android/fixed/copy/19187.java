public void addCourse(dddkata.tutoring.scheduling.Course course) {
    if ((this.courses.size()) > 0) {
        markTwoConflictedCourses(course);
    }
    this.courses.put(course.getName(), course);
}