@java.lang.Override
public void onLocationFailed() {
    android.support.design.widget.Snackbar.make(findViewById(android.R.id.content), "Make sure you have google play services installed", Snackbar.LENGTH_LONG).show();
}