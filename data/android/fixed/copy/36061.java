public void dropStudent(edu.macalester.registrar.Student student) {
    students.remove(student);
    if (!(waitList.isEmpty())) {
        waitList.poll().enrollIn(this);
    }
}