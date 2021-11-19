@java.lang.Override
protected void onPreExecute() {
    isUserInLD = false;
    android.view.View container = bhApp.mainActivity.findViewById(R.id.weeklyLdUserRL);
    if (container != null)
        container.setVisibility(View.GONE);
    
}