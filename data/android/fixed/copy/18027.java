@java.lang.Override
public void playMusic(final javafx.scene.media.MediaPlayer sound) {
    sound.setOnEndOfMedia(new java.lang.Runnable() {
        public void run() {
            sound.seek(javafx.util.Duration.ZERO);
        }
    });
    sound.seek(javafx.util.Duration.ZERO);
    sound.play();
}