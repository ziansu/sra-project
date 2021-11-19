public void loadTask(com.droneemployee.client.common.Task task) {
    tasks.add(task);
    for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
        observer.updateLoadTask(task);
    }
}