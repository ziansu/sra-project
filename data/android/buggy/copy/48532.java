@java.lang.Override
protected void onPostExecute(java.lang.String strFromDoInBg) {
    if ((membershipId) == null) {
        resetGuardList();
    }
    adapter.upDateEntries(guardians);
    spinner.setVisibility(View.GONE);
}