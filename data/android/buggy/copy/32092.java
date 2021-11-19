@java.lang.Override
public void onLoadSuccess() {
    android.util.Log.i(app.park.com.vr.VrVideoActivity.TAG, ("Sucessfully loaded video " + (mVrVideoView.getDuration())));
    loadVideoStatus = app.park.com.vr.VrVideoActivity.LOAD_VIDEO_STATUS_SUCCESS;
    mVrVideoView.pauseVideo();
}