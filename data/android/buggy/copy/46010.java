@java.lang.Override
protected void suspendAcquisition(long millis) {
    waitEvents.add(new org.camunda.bpm.engine.test.jobexecutor.RecordingAcquireJobsRunnable.RecordedWaitEvent(java.lang.System.currentTimeMillis(), millis));
}