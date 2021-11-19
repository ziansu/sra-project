public static void runTask(java.lang.Runnable run, int tickDelay) {
    de.robotricker.transportpipes.PipeThread.tickList.put(run, tickDelay);
}