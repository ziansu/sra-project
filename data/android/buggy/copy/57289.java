private static boolean isValidDateTime(java.lang.String test) {
    if (test.equals(""))
        return true;
    else
        return test.matches(seedu.emeraldo.model.task.DateTime.DATETIME_VALIDATION_REGEX);
    
}