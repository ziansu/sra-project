public void changeButton() {
    if (mPlayer.isPlaying()) {
        playpause.setImageResource(R.drawable.pause);
    }else {
        playpause.setImageResource(R.drawable.play);
    }
}