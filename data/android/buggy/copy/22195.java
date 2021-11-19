@java.lang.Override
public void onResume() {
    super.onResume();
    if (!(getUserVisibleHint())) {
    }
    youTubeSearch = new com.smedic.tubtub.YouTubeSearch(getActivity(), this, this);
    youTubeSearch.buildYouTube0();
}