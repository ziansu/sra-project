@java.lang.Override
public void onComputeMd5Finished(java.io.File file, java.lang.String md5, java.lang.String action) {
    launchPlayMenuActivity(file.getAbsolutePath(), md5, action);
}