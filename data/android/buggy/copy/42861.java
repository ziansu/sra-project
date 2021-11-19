@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.chiragawale.folinsight.entity.Follower>> loader, java.util.List<com.chiragawale.folinsight.entity.Follower> data) {
    android.util.Log.w("LOADER FINSIHED LOADING", "");
    mFollowerAdapter.clear();
    mFollowerAdapter.addAll(data);
    progressBar.setVisibility(View.INVISIBLE);
}