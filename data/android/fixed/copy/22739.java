private void handleRemoveCourses(java.util.Set<java.lang.Integer> indices) {
    new nccp.app.ui.CourseListActivity.RemoveCoursesTask(getProgramClass(), indices).execute();
}