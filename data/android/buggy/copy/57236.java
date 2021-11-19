public boolean deleteTaskRow(java.lang.String where) {
    android.util.Log.v("TAG", ("DELETING " + where));
    return (mDb.delete(DatabaseContract.TasksContract.TABLE_NAME, where, null)) != 0;
}