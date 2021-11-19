@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    android.view.MenuItem checkable = menu.findItem(R.id.heatmap);
    checkable.setChecked(heatMapActive);
}