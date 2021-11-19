@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if ((mControlsFrame) != null)
        mControlsFrame.setVisibility(View.INVISIBLE);
    
}