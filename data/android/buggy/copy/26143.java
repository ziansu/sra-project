public void loadFirstPageAndScrollToTop() {
    com.bumptech.glide.Glide.get(getContext()).clearMemory();
    gov.anzong.meizi.MeiziListViewUtils.smoothScrollListViewToTop(mAdapterView);
    loadFirstPage();
}