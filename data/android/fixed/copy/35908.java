public void getFileContent() {
    java.io.File f = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Tracker_Camera");
    java.io.File[] files = f.listFiles();
}