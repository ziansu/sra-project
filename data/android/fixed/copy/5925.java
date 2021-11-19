private void setPlayButtonIcon() {
    if ((playButton) != null) {
        if (stopwatchState.isRunning())
            playButton.setImageResource(android.R.drawable.ic_media_pause);
        else
            playButton.setImageResource(android.R.drawable.ic_media_play);
        
    }
}