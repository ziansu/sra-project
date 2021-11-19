public void loadTask(com.droneemployee.client.common.Task task) {
    for (com.droneemployee.client.SharedTaskList.Observer observer : observers) {
        tasks.add(task);
        observer.updateLoadTask(task);
    }
}