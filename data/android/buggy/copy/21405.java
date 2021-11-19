@java.lang.Override
protected void onResume() {
    super.onResume();
    mapFragment.getMapAsync(this);
    com.cloudprint.CloudPrint.isNetworkOK(this);
}