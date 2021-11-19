public void add(seedu.address.model.person.Task toAdd) throws seedu.address.model.person.TaskList.DuplicateTaskException {
    assert toAdd != null;
    if (contains(toAdd)) {
        throw new seedu.address.model.person.TaskList.DuplicateTaskException();
    }
    internalList.add(toAdd);
}