@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    this.holder = holder;
    if (null != (currVideoModel)) {
        if (videoPauseFlag) {
            videoPauseFlag = false;
        }
        playVideo(currVideoModel);
    }
}