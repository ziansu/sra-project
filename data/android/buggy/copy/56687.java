@java.lang.Override
public void showMoreItems() {
    homepageItemsAdapter.initData(me.aaron.zhihudaily.view.activities.MainActivity.returnMainPresenter().getLatestBean());
    homepageItemsAdapter.notifyDataSetChanged();
    android.util.Log.d("88888888", ("showMoreItems: " + (me.aaron.zhihudaily.view.fragments.HomePageFragment.isLoading)));
    me.aaron.zhihudaily.view.fragments.HomePageFragment.isLoading = false;
}