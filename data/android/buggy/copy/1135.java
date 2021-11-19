public void setDrawerEnabled(boolean enabled) {
    int lockMode = (enabled) ? android.support.v4.widget.DrawerLayout.LOCK_MODE_UNLOCKED : android.support.v4.widget.DrawerLayout.LOCK_MODE_LOCKED_CLOSED;
    mDrawer.setDrawerLockMode(lockMode);
    drawerToggle.setDrawerIndicatorEnabled(enabled);
}