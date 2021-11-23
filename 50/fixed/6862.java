br.com.kdev.task.Task getTaskObject(java.lang.String taskJSON) throws java.io.IOException {
    return mapper.readValue(taskJSON, br.com.kdev.task.Task.class);
}