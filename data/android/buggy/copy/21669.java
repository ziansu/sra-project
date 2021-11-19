public void addCourse(stumasys.db.Course c) {
    if (involvedIn.contains(c)) {
        return false;
    }
    involvedIn.add(c);
    return true;
}