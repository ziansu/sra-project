public void stop() {
    synchronized(mTasks) {
        try {
            mbCenterStopped = true;
            mTasks.notifyAll();
            com.androidlogsuite.task.TaskCenter.mSelector.close();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}