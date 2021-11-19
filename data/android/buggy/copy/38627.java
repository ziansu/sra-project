public void changeButton() {
    if (mPlayer.isPlaying()) {
        playpause.setImageResource(R.drawable.play);
    }else {
        playpause.setImageResource(R.drawable.pause);
    }
}