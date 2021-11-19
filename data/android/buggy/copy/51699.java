public void setQueueIdle() {
    if (!(queueActive))
        return ;
    
    queueIdleTime = java.lang.System.currentTimeMillis();
    java.lang.System.err.println(("QueueIT set to " + (queueIdleTime)));
}