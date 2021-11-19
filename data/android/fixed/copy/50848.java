public boolean commandExists(java.lang.String name) {
    boolean b = getDatabase().find(sk.tomsik68.helpplus.CommandInfo.class).where().ieq("name", name).findList().isEmpty();
    return b;
}