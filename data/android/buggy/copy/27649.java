@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    Activity.PetientListActivity.mAdapter.notifyDataSetChanged();
    stopDialog();
}