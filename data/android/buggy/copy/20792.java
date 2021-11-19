@java.lang.Override
protected void onDataReceived() {
    adapter.setItems(data.peopleOrdered());
    adapter.notifyDataSetChanged();
    mDrawerListView.setItemChecked(com.johnsimon.payback.ui.fragment.NavigationDrawerFragment.mCurrentSelectedPosition, true);
    setSelectedPerson(FeedActivity.person);
    selectItem(com.johnsimon.payback.ui.fragment.NavigationDrawerFragment.mCurrentSelectedPosition);
    updateBalance();
}