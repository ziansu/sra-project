@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mPhotoTargetFolder = null;
    if ((mSelectPhotoList) != null) {
        mSelectPhotoList.clear();
    }
    java.lang.System.gc();
}