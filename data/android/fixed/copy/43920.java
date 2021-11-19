public void setStudentByCourseId(java.lang.String courseId) {
    this.courseId = courseId;
    list = getAllStudentByCourseId(courseId);
    fireTableDataChanged();
}