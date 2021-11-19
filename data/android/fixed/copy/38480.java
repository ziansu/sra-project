private void checkValidDuration(todolist.model.task.StartTime tempStartTime, todolist.model.task.EndTime tempEndTime) throws todolist.commons.exceptions.IllegalValueException {
    if (!(tempStartTime.isValidDuration(tempEndTime))) {
        throw new todolist.commons.exceptions.IllegalValueException(todolist.commons.core.Messages.MESSAGE_INVALID_DURATION);
    }
}