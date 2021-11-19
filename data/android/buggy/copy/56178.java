@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.v("CLICK", "clickclickclick");
    sortByLocation();
    mAdapter.notifyDataSetChanged();
}