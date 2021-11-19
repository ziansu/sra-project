@java.lang.Override
public boolean isShuffleComplete() {
    java.util.List<com.rasp.mr.master.Task> tasks = new java.util.ArrayList<com.rasp.mr.master.Task>();
    tasks.addAll(shuffleTasks);
    shuffleComplete = isTaskComplete(mapComplete, tasks);
    return shuffleComplete;
}