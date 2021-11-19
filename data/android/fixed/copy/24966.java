protected int registerTimeTask(T newTask) {
    tasks.put((newTask.key = newTask.hashCode()), newTask);
    return newTask.key;
}