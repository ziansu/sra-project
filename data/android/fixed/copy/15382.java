public void CreateCategory(java.lang.String categoryName, android.database.sqlite.SQLiteDatabase db) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(team5.diabetesself_managmentapp.DatabaseHelper.CATEGORY_NAME, categoryName);
    db.insert(team5.diabetesself_managmentapp.DatabaseHelper.TABLE_CATEGORIES, null, values);
}