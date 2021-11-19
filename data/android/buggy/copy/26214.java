@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (mediaPlayer != null) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }
}