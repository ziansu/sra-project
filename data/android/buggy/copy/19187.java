public void addCourse(dddkata.tutoring.scheduling.Course course) {
    this.courses.put(course.getName(), course);
    markTwoConflictedCourses(course);
}