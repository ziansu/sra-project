public void addLabel(android.database.sqlite.SQLiteDatabase db, java.lang.String text) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(exjobb.selfannotationsystem.Database.DBLabelHelper.COLUMN_VALUE, text);
    db.insert(exjobb.selfannotationsystem.Database.DBLabelHelper.TABLE_LABELS, null, values);
}