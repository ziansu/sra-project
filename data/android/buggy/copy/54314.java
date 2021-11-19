public void pauseButton(android.view.MenuItem mi) {
    if ((mPlayer) != null)
        mPlayer.pause(null);
    
    mi.setIntent(mi.getIntent());
}