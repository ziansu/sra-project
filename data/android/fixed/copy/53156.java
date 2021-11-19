public void drop(edu.macalester.registrar.Course course) {
    if (courses.contains(course)) {
        course.drop(this);
        courses.remove(course);
    }
}