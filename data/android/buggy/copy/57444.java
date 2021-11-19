@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS PlayScoresHis");
    onCreate(db);
}