public void changeTaskStatus(java.util.UUID uuid, java.lang.String status) {
    android.util.Log.i("BaoBao111", uuid.toString());
    vn.com.baohq.simpletodo.data.TaskItem taskItem = getTaskById(uuid);
    taskItem.setStatus(status);
    updateTask(taskItem);
}