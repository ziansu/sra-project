public boolean scoresHasThisStudent(gradebookproject.Student s) {
    for (java.lang.Integer i : scores.keySet()) {
        if (i == (s.getIdNumber())) {
            return true;
        }
    }
    return false;
}