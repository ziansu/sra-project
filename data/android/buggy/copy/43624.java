public static boolean isExternalStorageWritable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    if (Environment.MEDIA_MOUNTED.equals(state)) {
        return true;
    }
    return false;
}