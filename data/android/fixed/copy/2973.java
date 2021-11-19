private void insertDefaultData(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String insertQuery = "INSERT INTO categories VALUES (NULL, 'Daily', 1);";
    java.lang.String insertQuery2 = "INSERT INTO categories VALUES (NULL, 'Personal', 0);";
    java.lang.String insertQuery3 = "INSERT INTO categories VALUES (NULL, 'Work', 0);";
    db.execSQL(insertQuery);
    db.execSQL(insertQuery2);
    db.execSQL(insertQuery3);
}