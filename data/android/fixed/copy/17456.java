@java.lang.Override
public void updateFilteredTaskListForReminder() {
    updateFilteredTaskList(new seedu.whatsnext.model.ModelManager.PredicateExpression(new seedu.whatsnext.model.ModelManager.ReminderQualifier()));
}