public void removeWithTasks() {
    for (int i = 0; i < (tasks.size()); i++) {
        tasks.get(i).cancel();
        i--;
    }
    remove();
}