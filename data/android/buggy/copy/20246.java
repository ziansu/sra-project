public synchronized void put(final com.evernote.android.job.JobRequest request) {
    updateRequestInCache(request);
    store(request);
}