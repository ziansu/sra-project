@java.lang.Override
public void dismissProgressDialog() {
    if ((progress) != null) {
        progress.dismiss();
        progress = null;
    }else {
        android.util.Log.e("Progressbar", " is null!");
    }
}