private internetofeveryone.ioe.Data.Website cursorToWebsite(android.database.Cursor cursor) {
    return new internetofeveryone.ioe.Data.Website(cursor.getString(0), cursor.getString(1), cursor.getString(2));
}