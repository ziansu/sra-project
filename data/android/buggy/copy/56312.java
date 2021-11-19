public void showAndLock(android.view.animation.Animation.AnimationListener listener) {
    if (!(mLogoEnabled)) {
        return ;
    }
    unlockAndShow(listener);
    mVisibilityLock = com.android.internal.navigation.fling.FlingLogoController.LOCK_SHOW;
}