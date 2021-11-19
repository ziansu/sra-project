@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem menuItem) {
    android.util.Log.d(com.codepath.nytimes.activity.NYTimesMainActivity.TAG, ("Menu Item Clicked = " + (menuItem.toString())));
    filteredSearch = true;
    showSearchFilterDialog();
    return false;
}