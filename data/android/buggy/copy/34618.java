public void stop() {
    getAudioPlayerManager().stop();
    progressBar.setProgress(org.mercycorps.translationcards.media.DecoratedMediaManager.RESET_PROGRESS_BAR);
    scheduledFuture.cancel(true);
}