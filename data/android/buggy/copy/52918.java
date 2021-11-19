private void pause() {
    mMusicList.get(mLastPosition).isPlaying = false;
    mMusicListAdapter.notifyDataSetChanged();
    startIntent(mLastPosition, MusicService.PLY_PAUSE);
}