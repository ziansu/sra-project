@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d(com.discflux.android.spotifystreamer.PlayFragment.LOG_TAG, "Activity Resumed");
    getActivity().bindService(mPlaybackService, mConnection, Context.BIND_AUTO_CREATE);
}