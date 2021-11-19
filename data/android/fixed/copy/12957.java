protected final void addMigrationWarning() {
    if ((updateTask) != null) {
        updateTask.addError("EveApi characters can be migrated to ESI", "Add ESI characters in the account manager:\r\nOptions > Accounts... > Add > ESI");
    }
}