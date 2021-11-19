private void releaseMediaPlayer() {
    if ((mMediaPlayer) != null) {
        new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mMediaPlayer.release();
                mMediaPlayer = null;
            }
        }).start();
    }
}