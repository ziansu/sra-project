@java.lang.Override
protected void onResume() {
    super.onResume();
    com.example.nearbyplaces.DialogUtils.showProgress(this, "getting location");
    startLocation();
}