@java.lang.Override
public void onConfigure(android.database.sqlite.SQLiteDatabase database) {
    this.database = database;
    this.onConfigure(database);
}