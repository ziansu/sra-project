@java.lang.Override
public void onClick(android.view.View v) {
    mRightDrawerGroupContainer.setVisibility(View.VISIBLE);
    mRightDrawerGroupContainer.startAnimation(animScaleUp);
    mRightDrawerFriendContainer.setVisibility(View.GONE);
}