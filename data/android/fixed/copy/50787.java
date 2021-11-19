@java.lang.Override
public void onKeyboardOpen(int keyboardHeight) {
    hideToolBox();
    mFrameState = com.newbiechen.chatframeview.widget.ChatFrameView.STATE_BOARD;
    if ((mListener) != null) {
        mListener.onKeyboardOpen(keyboardHeight);
    }
}