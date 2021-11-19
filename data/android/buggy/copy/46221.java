private void changeTaskDate(java.lang.String descriptionSplit, defaultPart.TaskDate taskDate) {
    java.util.Calendar date = getDateFromString(descriptionSplit);
    taskDate.setDate(date);
}