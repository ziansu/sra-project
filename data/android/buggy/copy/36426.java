protected internetofeveryone.ioe.Data.Website cursorToWebsite(android.database.Cursor cursor) {
    internetofeveryone.ioe.Data.Website website = new internetofeveryone.ioe.Data.Website(cursor.getString(0), cursor.getString(1), cursor.getString(2));
    return website;
}