@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    mDrawerLayout.closeDrawers();
    switch (item.getItemId()) {
        case R.id.action_notification_item :
            showNotificationTab();
    }
    return false;
}