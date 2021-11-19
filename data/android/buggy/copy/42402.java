public void removeTask(int id) {
    for (Task t : tasks) {
        if ((t.getId()) == id)
            tasks.remove(t);
        
    }
}