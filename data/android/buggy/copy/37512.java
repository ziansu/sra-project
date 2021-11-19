private void onPhotoTaken() {
    takenPhotoBitmap = getBitmapFromLocation(takenPhotoLocation);
    com.scanlibrary.ScanFragment.DocumentFromBitmapTask documentFromBitmapTask = new com.scanlibrary.ScanFragment.DocumentFromBitmapTask(takenPhotoBitmap, null, 0, 0);
    documentFromBitmapTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
}