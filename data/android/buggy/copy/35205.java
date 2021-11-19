@java.lang.Override
protected void onDestroy() {
    super.onStop();
    if ((flashLight) != null)
        flashLight.releaseCamera();
    
}