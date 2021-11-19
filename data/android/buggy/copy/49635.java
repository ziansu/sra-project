private java.util.LinkedList<entities.Session> setTopLevelAssignments() {
    assert (con) != null;
    entities.Lecture firstLecture = lecturesToAssign.getFirst();
    java.util.LinkedList<entities.Session> r = con.getSessionsSatisfyingHC(firstLecture, sessionList);
    return r;
}