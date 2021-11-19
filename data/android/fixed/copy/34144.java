public com.nexus.simplify.TaskList readFromFile() {
    if (tempList.isEmpty()) {
        return new com.nexus.simplify.TaskList();
    }else {
        taskList = convertToTaskList(tempList);
        return taskList;
    }
}