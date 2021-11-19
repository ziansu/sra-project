public boolean insertCourse(com.crayons_2_0.model.Course course) {
    courseDAO.insert(course);
    return true;
}