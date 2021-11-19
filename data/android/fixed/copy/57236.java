public boolean deleteTaskRow(java.lang.String where) {
    return (mDb.delete(DatabaseContract.TasksContract.TABLE_NAME, where, null)) != 0;
}