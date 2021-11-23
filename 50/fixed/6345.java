private void handleJobStartedEvent(org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJobStartedEvent event) {
    synchronized(jobsLock) {
        jobsSnapshot.removePendingJob(event.getJob());
        jobsSnapshot.addOrReplaceRunningJob(event.getJob());
        setChanged();
        notifyObservers(null);
    }
}