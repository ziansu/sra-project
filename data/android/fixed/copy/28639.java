@java.lang.Override
protected void onProgressUpdate(java.lang.Integer[] values) {
    super.onProgressUpdate(values);
    android.util.Log.v("Log", "progress updating");
    notifyDataSetChanged();
}