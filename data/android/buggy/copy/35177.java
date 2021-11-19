public final void stop() {
    if (isPlaying()) {
        try {
            clip.stop();
        } catch (java.lang.IllegalArgumentException e) {
            device = false;
            java.lang.System.out.println("no device to play audio from");
        }
        playing = false;
    }
}