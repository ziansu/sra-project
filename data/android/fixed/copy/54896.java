protected void notFavoriteInit() {
    if ((search_instructions) != null) {
        search_instructions.setVisibility(View.VISIBLE);
        no_results.setVisibility(View.GONE);
        loadingPanel.setVisibility(View.GONE);
        mListView.setVisibility(View.GONE);
    }
}