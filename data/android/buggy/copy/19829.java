@java.lang.Override
protected void onPreExecute() {
    isUserInLD = false;
    android.view.View container = bhApp.mainActivity.findViewById(R.id.weeklyLdUserRL);
    container.setVisibility(View.GONE);
}