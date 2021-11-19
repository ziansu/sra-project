@java.lang.Override
public void onClick(android.view.View v) {
    mRightDrawerFriendContainer.setVisibility(View.VISIBLE);
    mRightDrawerFriendContainer.startAnimation(animScaleUp);
    mRightDrawerGroupContainer.setVisibility(View.GONE);
}