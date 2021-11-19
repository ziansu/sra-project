public java.util.List<com.aiosdev.isports.data.Task> queryTask() {
    java.util.List<com.aiosdev.isports.data.Task> taskList = org.litepal.crud.DataSupport.select("step").limit(10).find(com.aiosdev.isports.data.Task.class);
    return taskList;
}