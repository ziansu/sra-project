public org.wordpress.android.fluxc.model.SiteModel getSelectedSite() {
    if ((getActivity()) instanceof org.wordpress.android.ui.main.WPMainActivity) {
        org.wordpress.android.ui.main.WPMainActivity mainActivity = ((org.wordpress.android.ui.main.WPMainActivity) (getActivity()));
        mainActivity.getSelectedSite();
    }
    return null;
}