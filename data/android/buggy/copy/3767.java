@java.lang.Override
protected void onPostExecute(java.lang.String aVoid) {
    super.onPostExecute(aVoid);
    mProgressBar.setVisibility(View.GONE);
    android.util.Log.d("ONPOSTEXECUTE", ("Array = " + (mArrayList.toString())));
    mArrayAdapter.notifyDataSetChanged();
}