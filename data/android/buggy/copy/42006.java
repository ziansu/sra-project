@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.hajir.morgenlandqr.DbHelper.SQL_CREATE);
    db.execSQL(com.example.hajir.morgenlandqr.DbHelper.SQL_CREATE2);
}