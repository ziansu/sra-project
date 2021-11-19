public com.crayons_2_0.model.Course findCourseByTitle(java.lang.String courseTitle) {
    for (com.crayons_2_0.model.Course tmpCourse : findAll()) {
        java.lang.System.out.println(tmpCourse.getTitle());
        if (tmpCourse.getTitle().equals(courseTitle)) {
            return tmpCourse;
        }
    }
    return null;
}