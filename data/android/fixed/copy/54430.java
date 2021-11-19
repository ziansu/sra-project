@java.lang.Override
public void onClick(android.view.View view) {
    mPlayer = android.media.MediaPlayer.create(this, R.raw.e_note_sound);
    mPlayer.start();
}