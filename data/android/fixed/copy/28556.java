@java.lang.Override
public void onPageSelected(int position) {
    super.onPageSelected(position);
    aptoideNavigationTracker.registerView(((cm.aptoide.pt.NavigationTrackerPagerAdapterHelper) (getAdapter())).getItemName(position));
    pageViewAnalytics.sendPageViewedEvent();
}