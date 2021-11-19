@java.lang.Override
protected void loadMoreItems() {
    isLoading = true;
    (mCurrentPage)++;
    android.widget.Toast.makeText(getActivity(), "loading next page", Toast.LENGTH_LONG).show();
    loadNextPage();
}