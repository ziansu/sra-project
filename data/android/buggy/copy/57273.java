private void startupDatabase() {
    com.jeff.booktracker.db.DatabaseManager databaseManager = ((com.jeff.booktracker.db.DatabaseManager) (applicationContext.getBean("databaseManager")));
    databaseManager.init();
}