public com.mycompany.testverktygserver.models.User login(java.lang.String userName, java.lang.String password) {
    com.mycompany.testverktygserver.models.Student student = userRepo.loginStudents(userName, password);
    if (student != null) {
        return student;
    }
    com.mycompany.testverktygserver.models.Teacher teacher = userRepo.loginTeachers(userName, password);
    return teacher;
}