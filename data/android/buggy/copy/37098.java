@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((keyword) != null) {
        android.util.Log.i("keyword-> ", ("" + (keyword)));
        search(keyword);
    }
    adapter.notifyDataSetChanged();
}