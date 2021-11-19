@java.lang.Override
protected void onResume() {
    super.onResume();
    musicPlayer.attachMusics(musics, selectedMusic);
}