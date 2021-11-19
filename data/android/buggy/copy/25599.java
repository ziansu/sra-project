public void dropAllTables() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    for (java.lang.String string : com.rudie.severin.textadventure.InformationHolders.PH.all_tables) {
        db.execSQL(("DROP TABLE IF EXISTS " + string));
    }
}