@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.detailfragment, menu);
    android.view.MenuItem menuItem = menu.findItem(R.id.action_share);
    android.widget.ShareActionProvider mShareActionProvider = ((android.widget.ShareActionProvider) (android.view.MenuItem.getActionProvider(menuItem)));
}