@java.lang.Override
public void add(seedu.multitasky.model.entry.ReadOnlyEntry toAdd) throws seedu.multitasky.model.entry.exceptions.DuplicateEntryException {
    super.add(toAdd);
    assert toAdd instanceof seedu.multitasky.model.entry.Deadline;
    internalList.add(new seedu.multitasky.model.entry.Deadline(toAdd));
    sortInternalList();
}