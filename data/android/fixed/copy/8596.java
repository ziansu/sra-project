@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... voids) {
    try {
        downloadImages();
        return true;
    } catch (java.lang.Exception e) {
        android.util.Log.e("downloadImages", e.toString());
        return false;
    }
}