@java.lang.Override
public void showMoreItems() {
    homepageItemsAdapter.initData(me.aaron.zhihudaily.view.activities.MainActivity.returnMainPresenter().getLatestBean());
    homepageItemsAdapter.notifyDataSetChanged();
    me.aaron.zhihudaily.view.fragments.HomePageFragment.isLoading = false;
}