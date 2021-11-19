@java.lang.Override
protected void onResume() {
    super.onResume();
    checkPlayServices();
    if (this.playServicesOk)
        launchChecksComplete();
    
}