@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    mediaPlayer.seekTo(0);
    android.widget.Toast.makeText(this, "The audio lesson has finished playing.", Toast.LENGTH_SHORT).show();
    fab.setImageResource(R.drawable.ic_play);
}