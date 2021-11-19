@java.lang.Override
public void fragmentItemViewDismiss() {
    if ((itemViewFragment) != null) {
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        fm.popBackStackImmediate();
    }
    this.instantiableViewControllerRequestsDismissal(itemViewFragment.instance);
    itemViewFragment = null;
}