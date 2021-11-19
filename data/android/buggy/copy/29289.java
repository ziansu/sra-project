private void resetDatabase() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL("drop table person;");
    db.execSQL("drop table personcapture;");
    db.execSQL(createPersonTable);
    db.execSQL(createPersonWordTable);
    db.close();
}