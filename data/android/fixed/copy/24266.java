@java.lang.Override
public boolean onNavigationItemSelected(int itemPosition, long itemId) {
    if (((mActiveFragment) != null) && (mActiveFragment.isAdded())) {
        return mActiveFragment.onAccountChanged(itemId);
    }
    return false;
}