@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    de.greenrobot.event.EventBus.getDefault().register(this);
    com.nullcognition.spotifystreamer.IntentServiceArtistSearch.searchByArtistName(getActivity(), "Paul");
}