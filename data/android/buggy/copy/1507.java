private boolean thereAreStudentsLeft() {
    boolean more_students = true;
    for (java.util.List<ar.edu.itba.it.ss.sga_simulator.model.Student> students : _students) {
        more_students = more_students || ((students.size()) > 0);
    }
    return more_students;
}