@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.muhammad.movieapp.MovieDatabase.CREATE_TABLE);
}