public void dropStudent(edu.macalester.registrar.Student student) {
    students.remove(student);
    waitList.poll().enrollIn(this);
}