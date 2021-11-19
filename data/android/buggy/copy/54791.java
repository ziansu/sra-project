private void setSingleTypeFloatCommand() {
    java.lang.System.out.println(("taskId in float is " + (taskIdForTagging)));
    command = dooyit.logic.commands.CommandUtils.createEditCommandToFloat(taskIdForTagging);
}