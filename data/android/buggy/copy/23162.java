public void addToDb(int id) {
    java.lang.String query_normal = "INSERT INTO %s VALUES ('%d');";
    java.lang.String query = java.lang.String.format(android.database.DatabaseUtils.sqlEscapeString(query_normal), DbContract.Bookmarks.TABLE_NAME, id);
    org.fossasia.openevent.dbutils.DbSingleton dbSingleton = org.fossasia.openevent.dbutils.DbSingleton.getInstance();
    dbSingleton.insertQuery(query);
}