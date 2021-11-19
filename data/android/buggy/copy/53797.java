@java.lang.Override
public void addBlockedCommand(java.lang.String command) {
    getBlockedCommands().add(command);
    rawTargetCommands.add(command);
}