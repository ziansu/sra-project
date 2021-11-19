private static boolean isValidDateTime(java.lang.String test) {
    return test.matches(seedu.emeraldo.model.task.DateTime.DATETIME_VALIDATION_REGEX);
}