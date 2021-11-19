public void setCourses(java.util.List<demo.catalog.coursera.org.courserademoapp.domain.Course> courses) {
    mCourses = courses;
    clear();
    addAll(courses);
}