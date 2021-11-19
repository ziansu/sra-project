private void playMusic() {
    mediaFileLengthInMilliseconds = mediaPlayer.getDuration();
    java.lang.String time = convertMillisecondToTime(mediaFileLengthInMilliseconds);
    mediaPlayer.start();
    buttonPlayPause.setImageResource(R.drawable.button_pause);
    startTime = java.lang.System.currentTimeMillis();
}