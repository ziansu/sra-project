private java.io.File getStorageDir() {
    return new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "TestApp");
}