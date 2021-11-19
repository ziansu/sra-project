public void play() {
    if (mServiceBound) {
        playerViewPager.notifyDataSetChanged();
        vpSongPlaying.setCurrentItem(musicObject.getIndexOfCurrentSong());
        musicService.playSong();
    }
}