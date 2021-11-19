@java.lang.Override
protected android.support.v4.app.Fragment createFragment() {
    if ((this.searchFragment) == null) {
        this.searchFragment = new uk.co.ribot.androidboilerplate.ui.fragment.SearchFragment();
    }
    return searchFragment;
}