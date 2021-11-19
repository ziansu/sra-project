@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL((("CREATE TABLE " + (com.example.john.knowwoodboardapp.DatabaseHandler.TABLE_NAME)) + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SCORE INTEGER)"));
}