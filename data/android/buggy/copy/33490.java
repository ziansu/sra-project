public boolean isGroupExpanded(int groupPosition) {
    if ((mAdapter) == null) {
        return false;
    }
    return mAdapter.isGroupExpanded(groupPosition);
}