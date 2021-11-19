private java.io.File getStorageDir() {
    java.io.File dir = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "TestApp");
    if (!(dir.mkdirs()))
        android.util.Log.e(ubcorbit.org.testapp.services.FileAppenderService.TAG, "storage directory not created");
    
    return dir;
}