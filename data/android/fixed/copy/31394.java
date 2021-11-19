@java.lang.Override
protected void onPostExecute(java.lang.Integer aVoid) {
    super.onPostExecute(aVoid);
    setSwipeRefreshState(false);
    updateRecords();
}