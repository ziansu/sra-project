@java.lang.Override
public void onAnimationEnd() {
    if ((mIconComplete) != 0) {
        setIcon(mIconComplete);
    }else {
        setText(mCompleteText);
    }
    mMorphingInProgress = false;
    mState = com.dd.CircularProgressButton.State.COMPLETE;
}