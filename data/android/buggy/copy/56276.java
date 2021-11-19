@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mPhotoTargetFolder = null;
    mSelectPhotoList.clear();
    java.lang.System.gc();
}