public void open() throws android.database.SQLException {
    if ((database) == null) {
        database = db_helper.getWritableDatabase();
    }else
        if (!(database.isOpen())) {
            database = db_helper.getWritableDatabase();
        }
    
}