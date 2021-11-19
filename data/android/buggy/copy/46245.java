public void myInit() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    date.admin = kurswork.VODBC.VODBC.aLoadAdmin();
    date.courses = kurswork.VODBC.LODBC.aLoadCourses();
    initUserTabView();
    initGrupTabView();
    initRAtingTabView();
}