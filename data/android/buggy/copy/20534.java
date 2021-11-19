@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL((((("CREATE TABLE " + (com.gotwingm.my.meditation.RemindersDBHelper.TABLE_NAME)) + " (_ID INTEGER PRIMARY KEY AUTOINCREMENT, ") + (com.gotwingm.my.meditation.RemindersDBHelper.ACTION)) + " TEXT);"));
    android.util.Log.d("###", "Table created");
}