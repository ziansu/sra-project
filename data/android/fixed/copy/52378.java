@java.lang.Override
public void onComputeMd5Finished(java.io.File file, java.lang.String md5) {
    launchPlayMenuActivity(file.getAbsolutePath(), md5);
}