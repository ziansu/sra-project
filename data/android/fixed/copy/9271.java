private void onTaskAddedToQueue(com.idevicesinc.sweetblue.PA_Task task) {
    synchronized(m_lock) {
        task.assignDefaultOrdinal(this);
        task.onAddedToQueue(this);
        softlyCancelTasks(task);
        print();
    }
}