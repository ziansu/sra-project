void remove(se.unlogic.standardutils.threads.SimpleExecutionController<T> executionController) {
    taskGroupRemoveLock.lock();
    try {
        this.taskGroupList.remove(executionController);
        this.taskGroupRemoveCondition.signalAll();
    } finally {
        taskGroupRemoveLock.unlock();
    }
}