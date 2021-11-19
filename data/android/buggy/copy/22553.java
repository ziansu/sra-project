@java.lang.Override
public void playPrevious() {
    mCurrentPlayingSong = com.scott.su.smusic.util.MusicPlayUtil.getPreviousSong(mCurrentPlayingSong, mPlayListSongs, mCurrentPlayMode);
    playNew();
}