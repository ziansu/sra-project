private void play(java.lang.String fileName) {
    if (((currentAudio) != null) && (currentAudio.equals(fileName))) {
        playBtn.setImageResource(R.drawable.ic_pause_white_24dp);
    }else {
        stop();
    }
}