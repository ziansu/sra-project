@java.lang.Override
public void onNext(java.io.File file) {
    android.util.Log.d("peka", "file was download");
    android.util.Log.d("peka", ("File downloaded to " + (file.getAbsolutePath())));
}