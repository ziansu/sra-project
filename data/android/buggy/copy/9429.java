@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("Online", Online);
    intent.setClass(this, com.FSL.mcuTracker.ListActivity.class);
    callOtherActivity(intent, query);
    return false;
}