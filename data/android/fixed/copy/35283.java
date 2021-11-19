@java.lang.Override
public void onVideoViewChange(boolean hasVideo) {
    if (hasVideo) {
        mNoneView.setVisibility(View.INVISIBLE);
    }else {
        mNoneView.setVisibility(View.VISIBLE);
    }
}