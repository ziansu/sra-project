private void configure(javafx.collections.ObservableList<seedu.jimi.model.task.ReadOnlyTask> taskList, javafx.collections.ObservableList<seedu.jimi.model.task.ReadOnlyTask> eventList) {
    instantiateObjectLists(taskList, eventList);
    configureTaskColumnsCellFactories();
    configureEventsColumnsCellFactories();
    setConnections();
    addToPlaceholder();
    registerAsAnEventHandler(this);
}