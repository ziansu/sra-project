private void closeDatabaseNow(java.lang.String dbName) {
    android.database.sqlite.SQLiteDatabase mydb = this.getDatabase(dbName);
    if (mydb != null) {
        mydb.close();
        org.pgsqlite.SQLitePlugin.dbmap.remove(dbName);
    }
}