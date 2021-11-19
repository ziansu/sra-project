public boolean isSamePerson(seedu.address.model.task.ReadOnlyTask task) {
    return getFullName().equals(task.getName().fullName);
}