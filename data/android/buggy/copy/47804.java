@java.lang.Override
protected void onResume() {
    super.onResume();
    isActive = true;
    try {
        mLocationAccess.stopUpdates();
        mLocationAccess = null;
    } catch (java.lang.NullPointerException e) {
        mLocationAccess = new com.babykangaroo.android.mylocationlibrary.LocationAccess(this, this);
    }
}