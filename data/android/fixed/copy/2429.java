private long getNavBarShowDelay() {
    if (mStatusBar.isKeyguardFadingAway()) {
        return mStatusBar.getKeyguardFadingAwayDelay();
    }else {
        return com.android.systemui.statusbar.phone.StatusBarKeyguardViewManager.NAV_BAR_SHOW_DELAY_BOUNCER;
    }
}