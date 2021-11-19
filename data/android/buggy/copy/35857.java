public static java.lang.String removeDateTime(java.lang.String command, java.lang.String dateTime) {
    return taskcommando.logic.CommandParser.removeWord(taskcommando.logic.CommandParser.removeFirstWord(command), dateTime);
}