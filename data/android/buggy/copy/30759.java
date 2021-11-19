public boolean pop() {
    javafx.collections.ObservableList<seedu.jobs.model.task.Task> replacement = taskStack.pop();
    this.internalList.setAll(replacement);
    return true;
}