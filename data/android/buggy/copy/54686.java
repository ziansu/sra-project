public int timeTo(task_optimization_logic.Task task) {
    int[][] tempMatrix = task_optimization_logic.TaskManager.getMatrix();
    return tempMatrixp[this.x][task.y];
}