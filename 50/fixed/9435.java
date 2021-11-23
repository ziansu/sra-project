public static synchronized DatabaseManager getInstance() {
    if ((DatabaseManager.databaseManager) == null) {
        DatabaseManager.databaseManager = new DatabaseManager();
    }
    return DatabaseManager.databaseManager;
}