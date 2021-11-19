private void loadFile() throws java.io.IOException {
    taskList = fileOperation.getUnfinishedTaskListFromFile();
    completedTaskList = fileOperation.getFinishedTaskListFromFile();
    fileList = configurationFileOperation.getHistoryFilePath();
}