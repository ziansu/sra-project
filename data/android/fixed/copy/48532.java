@java.lang.Override
protected void onPostExecute(java.lang.String strFromDoInBg) {
    adapter.upDateEntries(guardians);
    spinner.setVisibility(View.GONE);
}