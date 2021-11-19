@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    for (java.util.Map.Entry<java.lang.String, java.lang.String> table : tables.entrySet()) {
        db.execSQL(table.getValue());
    }
}