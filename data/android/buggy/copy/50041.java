private static java.lang.String getApplicationStorageRootPath() {
    return ((android.os.Environment.getExternalStorageDirectory().getPath()) + "/") + (com.fezrestia.android.localcheckpointscheduler.storage.StorageController.ROOT_DIR_PATH);
}