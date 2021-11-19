@java.lang.Override
public void onLoading() {
    if ((mGroupsListView) != null)
        mGroupsListView.setVisibility(View.GONE);
    
    mLoadingIndicator.setVisibility(View.VISIBLE);
    mNoGroupsTextView.setVisibility(View.GONE);
}