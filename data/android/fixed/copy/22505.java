public void execute() throws seedu.jobs.model.task.UniqueTaskList.IllegalTimeException {
    for (seedu.jobs.model.task.ReadOnlyTask t : internalList) {
        new seedu.jobs.logic.calendar.AddCalendar(new seedu.jobs.model.task.Task(t), service);
    }
}