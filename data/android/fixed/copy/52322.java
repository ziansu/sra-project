@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    onCreate(db);
    android.widget.Toast.makeText(context, "onUpgrade called", Toast.LENGTH_SHORT).show();
}