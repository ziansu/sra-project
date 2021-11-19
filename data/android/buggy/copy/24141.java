public static boolean isValidEndDateTime(java.lang.String test) {
    werkbook.task.model.task.EndDateTime.END_DATETIME_FORMATTER.setLenient(false);
    try {
        werkbook.task.model.task.EndDateTime.END_DATETIME_FORMATTER.parse(test);
    } catch (java.text.ParseException e) {
        return false;
    }
    return true;
}