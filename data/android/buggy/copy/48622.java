public void setLogoView(com.android.internal.navigation.fling.FlingLogoView view) {
    mLogoView = view;
    if ((mLogoColor) != (view.getLogoColor())) {
        view.setLogoColor(mLogoColor);
    }
    view.animate().cancel();
    animateToCurrentState();
}