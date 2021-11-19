private void playPrevTrack() {
    if ((--(selTrackPos)) > 0)
        playTrack();
    else
        selTrackPos = 0;
    
}