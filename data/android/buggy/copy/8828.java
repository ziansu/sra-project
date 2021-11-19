@java.lang.Override
public void run() {
    context.getNativeModule(com.facebook.react.uimanager.UIManagerModule.class).updateNodeSize(mCoverView.getId(), coverViewWidth, coverViewHeight);
}