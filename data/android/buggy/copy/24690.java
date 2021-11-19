@java.lang.Override
public void onRefresh() {
    com.byteshaft.auction.SelectedCategoryList.initializeArrayAndHashMap();
    refresh = true;
    new com.byteshaft.auction.SelectedCategoryList.GetSpecificDataTask().execute(categorySpecificUrl);
}