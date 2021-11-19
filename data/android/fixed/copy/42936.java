public void awaitTermination() throws java.lang.InterruptedException {
    taskGroupRemoveLock.lock();
    try {
        while (!(taskGroupList.isEmpty())) {
            taskGroupRemoveCondition.await();
        } 
    } finally {
        taskGroupRemoveLock.unlock();
    }
}