public android.database.Cursor findAllStudentsForOverview() {
    return readableDb.query(dbStudent.TABLE_NAME, null, null, null, null, null, null);
}