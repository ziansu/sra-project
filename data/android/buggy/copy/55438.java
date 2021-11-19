@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase database) {
    database.execSQL((((((com.fyp.n3015509.db.MySQLiteHelper.CREATE_BOOK_TABLE) + (com.fyp.n3015509.db.MySQLiteHelper.CREATE_AUTHOR_TABLE)) + (com.fyp.n3015509.db.MySQLiteHelper.CREATE_BUZZLIST_TABLE)) + (com.fyp.n3015509.db.MySQLiteHelper.CREATE_BOOK_INTERIM_TABLE)) + (com.fyp.n3015509.db.MySQLiteHelper.CREATE_BUZZLIST_INTERIM_TABLE)));
}