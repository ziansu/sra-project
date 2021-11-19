@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) throws com.tonilopezmr.easysqlite.exception.SQLiteHelperException {
    if ((tables) == null) {
        throw new com.tonilopezmr.easysqlite.exception.SQLiteHelperException("The array of String tables can't be null!!");
    }
    executePragma(db);
    for (java.lang.String table : tables) {
        db.execSQL(table);
    }
}