public void start(de.mickare.xserver.ServerThreadPoolExecutor stpool) {
    synchronized(task) {
        if ((task.get()) == null) {
            task.set(stpool.runServerTask(this));
        }
    }
}