@org.junit.Test(expected = java.lang.IllegalThreadStateException.class)
public void threadFactoryReturnRunningThreadFail() {
    queueManager = org.threadly.concurrent.PrioritySchedulerQueueManagerTest.pScheduler.new org.threadly.concurrent.PriorityScheduler.QueueManager(new org.threadly.concurrent.StartingThreadFactory(), org.threadly.concurrent.PrioritySchedulerQueueManagerTest.THREAD_NAME);
    queueManager.start();
}