public void onSelectorChange() {
    this.flingAdapterContainer.clearTopView();
    this.cardIssueAdapter.setFilter(this.selectors);
    if ((this.watchListViewFragment) != null)
        this.watchListViewFragment.onSelectorChange();
    
}