@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.xunce.electrombile.database.MyDatabaseHelper.CREATE_DATETRACK);
    db.execSQL(com.xunce.electrombile.database.MyDatabaseHelper.CREATE_DATETRACKSECOND);
}