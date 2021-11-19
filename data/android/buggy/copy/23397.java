@java.lang.Override
public void onBackPressed() {
    brightcoveVideoView.stopPlayback();
    brightcoveVideoView.removeListeners();
    brightcoveVideoView = null;
    _plugin = null;
    super.onBackPressed();
}