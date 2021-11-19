private static void close(android.database.sqlite.SQLiteDatabase db) {
    if ((db != null) && (db.isOpen()))
        db.close();
    
}