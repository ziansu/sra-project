private void handleLoadMore() {
    footerViewLoading.setVisibility(View.GONE);
    footerViewLoadingVisible = false;
    isLoadingData = false;
    listViewAdapter.notifyDataSetChanged();
}