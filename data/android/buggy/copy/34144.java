public com.nexus.simplify.TaskList readFromFile() {
    if (tempList.isEmpty()) {
        return null;
    }else {
        taskList = convertToTaskList(tempList);
        return taskList;
    }
}