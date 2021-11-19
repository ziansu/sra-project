public void CreateCategory(java.lang.String categoryName) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(team5.diabetesself_managmentapp.DatabaseHelper.CATEGORY_NAME, categoryName);
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.insert(team5.diabetesself_managmentapp.DatabaseHelper.TABLE_CATEGORIES, null, values);
    db.close();
}