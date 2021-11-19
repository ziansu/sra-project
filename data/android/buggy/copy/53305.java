public void toastError(java.lang.Exception error) {
    android.util.Log.e("MPissue", error.toString());
    error.fillInStackTrace().printStackTrace();
}