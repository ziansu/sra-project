@java.lang.Override
public boolean onActionItemClicked(android.view.ActionMode mode, android.view.MenuItem item) {
    boolean isProceed = mCallback.onAction(item.getItemId(), mPendingItems);
    if (isProceed) {
        mPendingItems.clear();
    }
    return isProceed;
}