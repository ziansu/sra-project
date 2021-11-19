@java.lang.Override
public void onVideoViewChange(boolean hasVideo) {
    mCallBackContext.success("Video View Change");
    if (hasVideo) {
        mNoneView.setVisibility(View.INVISIBLE);
    }else {
        mNoneView.setVisibility(View.VISIBLE);
    }
}