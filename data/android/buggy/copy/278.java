public void addTask(com.appers.ayvaz.thetravelingsalesman.models.Task item) {
    android.content.ContentValues values = getContentValues(item);
    mDatabase.insert(DbSchema.TaskTable.NAME, null, values);
}