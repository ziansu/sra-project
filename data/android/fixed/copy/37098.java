@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.i("keyword-> ", ("" + (keyword)));
    if ((keyword) != null) {
        search(keyword);
    }
    adapter.notifyDataSetChanged();
}