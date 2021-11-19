public void cancelDexterServerJobs() {
    sendingResultScheduledFuture.cancel(false);
    mergingFilterScheduledFuture.cancel(false);
}