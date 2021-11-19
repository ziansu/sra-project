public void dropAllTables(android.database.sqlite.SQLiteDatabase db) {
    for (java.lang.String string : com.rudie.severin.textadventure.InformationHolders.PH.all_tables) {
        db.execSQL(("DROP TABLE IF EXISTS " + string));
    }
}