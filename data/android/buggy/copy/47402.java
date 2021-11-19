public void stop() {
    synchronized(mTasks) {
        try {
            com.androidlogsuite.task.TaskCenter.mSelector.close();
            mbCenterStopped = true;
            mTasks.notifyAll();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}