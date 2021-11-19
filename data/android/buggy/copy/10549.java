public void stopService() {
    getActivity().unbindService(mclab1.pages.MediaPlayerFragment.musicConnection);
    getActivity().stopService(mclab1.pages.MediaPlayerFragment.playIntent);
}