@java.lang.Override
protected boolean doSend(org.springframework.messaging.Message<?> message, long timeout) {
    tapThread.set(java.lang.Thread.currentThread());
    tapped.countDown();
    throw new java.lang.RuntimeException("bang");
}