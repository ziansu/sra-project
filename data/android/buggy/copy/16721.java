@java.lang.Override
protected void permissionWriteSystemGranted() {
    if ((mWifiApService) != null) {
        mWifiApService.openWifiAp();
    }
}