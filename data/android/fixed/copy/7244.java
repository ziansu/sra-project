public synchronized void start(de.mickare.xserver.ServerThreadPoolExecutor stpool) {
    if ((task.get()) == null) {
        task.set(stpool.runServerTask(this));
    }
}