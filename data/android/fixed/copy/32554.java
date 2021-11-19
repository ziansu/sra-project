public void loadTask(seedu.jobs.commons.core.UnmodifiableObservableList<seedu.jobs.model.task.ReadOnlyTask> list) throws seedu.jobs.model.task.UniqueTaskList.IllegalTimeException {
    new seedu.jobs.logic.calendar.LoadCalendar(seedu.jobs.logic.calendar.CalendarManager.service, list);
}