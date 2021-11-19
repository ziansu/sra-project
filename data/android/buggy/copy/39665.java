public void addAssignment(Assignment assignment) {
    listModel.addElement(assignment);
    java.lang.System.out.println(("Assignment grade" + (assignment.computeGrade())));
    this.computeGrade(assignment.computeGrade());
}