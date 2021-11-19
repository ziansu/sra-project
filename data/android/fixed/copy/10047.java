@java.lang.Override
public void onPause() {
    super.onPause();
    exoPlayer.setPlayWhenReady(false);
    ng.com.brownjee.bakingapp.fragments.StepsDetailsActivityFragment.mediaSession.setActive(false);
}