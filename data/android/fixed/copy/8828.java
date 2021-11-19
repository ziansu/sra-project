@java.lang.Override
public void run() {
    if ((mCoverView) != null) {
        context.getNativeModule(com.facebook.react.uimanager.UIManagerModule.class).updateNodeSize(mCoverView.getId(), coverViewWidth, coverViewHeight);
    }
}