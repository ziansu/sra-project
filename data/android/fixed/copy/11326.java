@java.lang.Override
public boolean onClose() {
    list.search(this, null);
    listAdapter.notifyDataSetChanged();
    android.util.Log.d(diy.uigeneric.sample.SampleListActivity.TAG, "search stop");
    return false;
}