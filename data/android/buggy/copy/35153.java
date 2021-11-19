public void notifyGroupItemRangeInserted(int groupPositionStart, int itemCount, boolean expanded) {
    if (!expanded) {
        notifyGroupItemRangeInserted(groupPositionStart, itemCount);
    }else {
        mAdapter.notifyExpandedGroupItemRangeInserted(groupPositionStart, itemCount);
    }
}