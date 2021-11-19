private void handleLoadMore() {
    footerViewLoading.setVisibility(View.GONE);
    listView.setFooterDividersEnabled(true);
    footerViewLoadingVisible = false;
    isLoadingData = false;
    listViewAdapter.notifyDataSetChanged();
}