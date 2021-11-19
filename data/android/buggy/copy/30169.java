@java.lang.Override
protected boolean doSend(org.springframework.messaging.Message<?> message, long timeout) {
    tapped.countDown();
    tapThread.set(java.lang.Thread.currentThread());
    throw new java.lang.RuntimeException("bang");
}