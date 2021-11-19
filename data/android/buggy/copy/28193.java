@java.lang.Override
public void onStop() {
    if (musicBound) {
        getActivity().unbindService(this);
        musicBound = false;
        mMusicService = null;
    }
    super.onStop();
}