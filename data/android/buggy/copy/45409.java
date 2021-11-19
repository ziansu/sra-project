@java.lang.Override
public void onNotAcceptingPermissions(com.sromku.simple.fb.Permission.Type type) {
    com.nispok.snackbar.Snackbar.with(getApplicationContext()).text("onNotAcceptingPermission").show(this);
}