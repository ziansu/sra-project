@java.lang.Override
public boolean onStartNestedScroll(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.support.design.widget.AppBarLayout child, android.view.View directTargetChild, android.view.View target, int nestedScrollAxes) {
    mLastDyConsumed = 0;
    if ((mAnimator) != null)
        mAnimator.cancel();
    
    return true;
}