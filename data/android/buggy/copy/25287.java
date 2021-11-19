@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (audioPlayer.equals(null))
        audioPlayer.release();
    
}