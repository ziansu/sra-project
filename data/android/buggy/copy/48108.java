public Zaliczenie.Student getStudent(java.lang.String name) {
    for (Zaliczenie.Student student : studentsList) {
        if (student.getName().equals(name)) {
            return student;
        }
    }
    return null;
}