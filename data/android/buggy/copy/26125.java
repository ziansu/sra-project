public java.util.ArrayList<logic.Task> completeCommand(int taskID) {
    logic.Task doneTask = logic.Execution.mainList.get(taskID);
    logic.Execution.doneList.add(doneTask);
    deleteTask(taskID);
    return logic.Execution.doneList;
}