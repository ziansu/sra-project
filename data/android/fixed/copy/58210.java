@com.facebook.react.uimanager.annotations.ReactProp(name = "aspectRatio")
public void setAspectRatio(com.pili.pldroid.player.widget.PLVideoView mVideoView, int aspectRatio) {
    this.aspectRatio = aspectRatio;
    mVideoView.setDisplayAspectRatio(aspectRatio);
}