void remove(se.unlogic.standardutils.threads.SimpleExecutionController<T> executionController) {
    taskGroupRemoveLock.lock();
    try {
        taskGroupList.remove(executionController);
        taskGroupRemoveCondition.signalAll();
    } finally {
        taskGroupRemoveLock.unlock();
    }
}