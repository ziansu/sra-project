@java.lang.Override
protected void onDataReceived() {
    mDrawerListView.setItemChecked(com.johnsimon.payback.ui.fragment.NavigationDrawerFragment.mCurrentSelectedPosition, true);
    setSelectedPerson(FeedActivity.person);
    selectItem(com.johnsimon.payback.ui.fragment.NavigationDrawerFragment.mCurrentSelectedPosition);
    updateBalance();
}