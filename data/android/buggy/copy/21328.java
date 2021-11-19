@java.lang.Override
public void onOpen(android.database.sqlite.SQLiteDatabase db) {
    super.onOpen(db);
    if (!(db.isReadOnly())) {
        db.setForeignKeyConstraintsEnabled(true);
    }
}