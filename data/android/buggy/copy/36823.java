@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    com.frostwire.android.gui.fragments.BrowsePeerFragment.LOG.info("onOptionsItemSelected");
    switch (item.getItemId()) {
        case R.id.fragment_browse_peer_menu_filter :
            return true;
        case R.id.fragment_browse_peer_menu_checkbox :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}