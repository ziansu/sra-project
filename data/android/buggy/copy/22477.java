@java.lang.Override
public void hide() {
    com.sina.sinavideo.sdk.VDVideoViewController controller = com.sina.sinavideo.sdk.VDVideoViewController.getInstance(this.getContext());
    if (controller != null)
        controller.removeOnVideoFrameADListener(this);
    
}