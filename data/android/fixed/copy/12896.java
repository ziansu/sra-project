private void closeCancelTaskStoreResultAckMessageQueue(com.pslcl.dtf.runner.RunnerService runnerService, java.lang.Boolean result) throws java.lang.Exception {
    this.closeCancelTask();
    this.topDBTemplate.result = result;
    this.storeResultAndAckMessageQueue(runnerService);
}