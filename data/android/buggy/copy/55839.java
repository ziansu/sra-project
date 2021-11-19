@java.lang.Override
protected java.io.File getLogFile() {
    return new java.io.File(job.getRootDir(), "pollMailboxTrigger-polling.log");
}