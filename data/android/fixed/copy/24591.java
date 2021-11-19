private boolean isExternalStorageAvalaible() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    return state.equals(Environment.MEDIA_MOUNTED);
}