@java.lang.Override
public seedu.whatsnext.commons.core.UnmodifiableObservableList<seedu.whatsnext.model.task.BasicTaskFeatures> getFilteredTaskList() {
    filteredTasks.setPredicate(null);
    return new seedu.whatsnext.commons.core.UnmodifiableObservableList(filteredTasks);
}