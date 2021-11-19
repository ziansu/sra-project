private ScheduleHacks.OldCommand.COMMAND_TYPE getCommand(Parser.Command existingCommand) {
    Parser.Command.COMMAND_TYPE executeCommand = null;
    try {
        executeCommand = existingCommand.getCommandType();
        return executeCommand;
    } catch (java.lang.Exception e) {
        setFeedBack(Logic.Logic.FEEDBACK_INVALID_COMMAND_TYPE);
        return null;
    }
}