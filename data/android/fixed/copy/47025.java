public boolean setEnrollmentLimit(int limit) {
    if ((enrolledStudents.size()) <= limit) {
        this.enrollLimit = limit;
        return true;
    }
    return false;
}