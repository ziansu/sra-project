@java.lang.Override
public void loadingStart() {
    loading = new android.app.ProgressDialog(this);
    loading.setMessage("Loading");
    loading.show();
}