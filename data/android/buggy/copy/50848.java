public boolean commandExists(java.lang.String name) {
    return getDatabase().find(sk.tomsik68.helpplus.CommandInfo.class).where().ieq("name", name).findList().isEmpty();
}