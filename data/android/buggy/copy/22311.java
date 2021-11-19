@java.lang.Override
public void onError(java.util.List<java.lang.String> errors) {
    android.app.AlertDialog.Builder dialog = new android.app.AlertDialog.Builder(this);
    dialog.setMessage(("create session errors: " + errors)).create().show();
}