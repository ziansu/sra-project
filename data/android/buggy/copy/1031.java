public void onActivate() {
    allCourses = this.courseDAO.searchCourses(java.util.Arrays.asList(searchQuery.split(" ")));
}