public java.util.List<sk.tomsik68.helpplus.CommandInfo> getAllCommands() {
    java.util.List<sk.tomsik68.helpplus.CommandInfo> result = getDatabase().find(sk.tomsik68.helpplus.CommandInfo.class).orderBy("name").findList();
    return result;
}