@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    createMatchTable(db);
    createInningsTable(db);
    createTeamTable(db);
    createPlayerTable(db);
    createBatterTable(db);
    createBowlerTable(db);
    createArchiveTable(db);
}