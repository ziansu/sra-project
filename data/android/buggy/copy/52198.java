public java.util.List<gradebook.Student> getGradebookStudents() {
    if ((helper.getStudentsFromGradebook(gradebookId).size()) != 0) {
        this.gradebookStudents = helper.getStudentsFromGradebook(gradebookId);
        return this.gradebookStudents;
    }
    return null;
}