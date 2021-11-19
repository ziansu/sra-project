@java.lang.Override
public void onAnimationEnd() {
    if ((mIconComplete) != 0) {
        setIcon(mIconError);
    }else {
        setText(mErrorText);
    }
    mMorphingInProgress = false;
    mState = com.dd.CircularProgressButton.State.ERROR;
}