@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.rut0.sqllistsync.DbHelper.CREATE_TABLE);
    database = db;
}