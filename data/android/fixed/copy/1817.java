@java.lang.Override
public void run() {
    mediacontroller.setEnabled(true);
    if ((musicPosition) != 0) {
        mediaPlayer.seekTo(musicPosition);
        mediaPlayer.start();
    }else {
        mediacontroller.show(5000);
    }
}