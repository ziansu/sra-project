public void onSelectorChange() {
    this.cardIssueAdapter.setFilter(this.selectors);
    this.flingAdapterContainer.clearTopView();
    if ((this.watchListViewFragment) != null)
        this.watchListViewFragment.onSelectorChange();
    
}