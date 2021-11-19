public void play(final long seek) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            playWavFile(mFile, 1, seek);
        }
    }).start();
}