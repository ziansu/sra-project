@java.lang.Override
public void delete() {
    this.myAssignments.remove(this);
    this.fireAssignmentChanged();
}