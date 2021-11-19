public void exoPlayerPause() {
    if ((isPlaying()) == true) {
        pause();
    }else {
        android.widget.Toast.makeText(mContext, "You are already pause", Toast.LENGTH_SHORT).show();
    }
}