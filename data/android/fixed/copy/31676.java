private void fireSelectedStudentEventForStudentAtIndex(int index) {
    edu.pdx.cs410J.grader.Student student;
    if (index == 0) {
        student = null;
    }else {
        student = this.students.get((index - 1));
    }
    fireStudentSelectedEvent(student);
}