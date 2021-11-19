@java.lang.Override
protected java.io.File getLogFile() {
    if ((job) != null) {
        return new java.io.File(job.getRootDir(), "pollMailboxTrigger-polling.log");
    }else {
        return new java.io.File("pollMailboxTrigger-polling.log");
    }
}