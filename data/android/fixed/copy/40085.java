@java.lang.Override
public void onSearchShopsSuccess(java.util.List<com.framgia.forder.data.model.Shop> shops) {
    android.support.v4.app.Fragment fragment = mAdapter.getFragment(SearchContainerAdapter.SearchResultsTab.TAB_SHOP);
    ((com.framgia.forder.screen.searchshop.ShopSearchResultFragment) (fragment)).setShops(shops);
}