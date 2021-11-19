@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.muhammad.movieapp.MovieDatabase.CREATE_TABLE);
    android.widget.Toast.makeText(context, "DB Created", Toast.LENGTH_LONG).show();
}