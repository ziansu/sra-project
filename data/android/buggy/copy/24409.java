@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(DropTable);
    android.widget.Toast.makeText(context, "DB to Update", Toast.LENGTH_LONG).show();
    onCreate(db);
}