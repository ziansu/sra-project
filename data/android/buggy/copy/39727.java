public void unlockAndHide(android.view.animation.Animation.AnimationListener listener) {
    if (!(mLogoEnabled)) {
        return ;
    }
    mVisibilityLock = com.android.internal.navigation.fling.FlingLogoController.LOCK_DISABLED;
    hide(listener);
}