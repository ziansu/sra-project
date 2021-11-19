public int getCommandsCount() {
    return getDatabase().find(sk.tomsik68.helpplus.CommandInfo.class).findRowCount();
}