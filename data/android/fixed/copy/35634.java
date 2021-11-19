private java.util.List<com.aiosdev.isports.data.Task> queryTask() {
    taskList = org.litepal.crud.DataSupport.select("step").limit(10).find(com.aiosdev.isports.data.Task.class);
    return taskList;
}