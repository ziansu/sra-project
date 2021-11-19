public boolean addTask(com.appers.ayvaz.thetravelingsalesman.models.Task item) {
    android.content.ContentValues values = getContentValues(item);
    return (mDatabase.insert(DbSchema.TaskTable.NAME, null, values)) > 0;
}