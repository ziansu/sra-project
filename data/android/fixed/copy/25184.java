@java.lang.Override
protected void onDestroy() {
    com.scausum.imageselector.lib.ImageSelector.clearInstance();
    super.onDestroy();
}