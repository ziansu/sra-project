@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.scausum.imageselector.lib.ImageSelector.clearInstance();
}