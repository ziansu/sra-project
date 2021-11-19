@java.lang.Override
protected void onStop() {
    mCollapsibleHeaderLayout.getLayoutCoordinator().releaseOnLayoutCoordinatorScrollWatcher();
    super.onStop();
}