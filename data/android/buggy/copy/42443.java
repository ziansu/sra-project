public android.database.Cursor findAllStudentsForOverview() {
    android.database.Cursor cursor = readableDb.query(dbStudent.TABLE_NAME, null, null, null, null, null, null);
    return cursor;
}