@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase database) {
    nl.qbusict.cupboard.CupboardFactory.cupboard().withDatabase(database).createTables();
}