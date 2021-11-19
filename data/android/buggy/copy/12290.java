@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if (mCellIsMobile)
        return ;
    
    mAboveItemId = INVALID_ID;
    mMobileItemId = INVALID_ID;
    mBelowItemId = INVALID_ID;
    mobileView.setVisibility(com.juztoss.dancemaker.views.VISIBLE);
    mHoverCell = null;
    setEnabled(true);
    invalidate();
}