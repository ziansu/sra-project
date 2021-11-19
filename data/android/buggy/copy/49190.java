public static boolean isFloatingTask(java.lang.String command) {
    return (command.equals("")) || (taskcommando.logic.CommandValidator.isHashTags(command));
}