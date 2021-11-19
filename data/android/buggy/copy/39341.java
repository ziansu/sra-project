@java.lang.Override
public void createTable(android.database.sqlite.SQLiteDatabase database) {
    database.execSQL(("DROP TABLE IF EXISTS " + (net.razysoft.production.Contract.Category.TABLE_NAME)));
    database.execSQL(net.razysoft.production.Contract.Category.SQL_CREATE_TABLE);
    database.close();
}