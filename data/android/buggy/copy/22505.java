public void execute() throws seedu.jobs.model.task.UniqueTaskList.IllegalTimeException {
    for (seedu.jobs.model.task.ReadOnlyTask t : internalList) {
        java.lang.System.out.println(t.getName().toString());
        new seedu.jobs.logic.calendar.AddCalendar(new seedu.jobs.model.task.Task(t), service);
    }
}