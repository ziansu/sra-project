@java.lang.Override
public void onNotFound(java.lang.String key) {
    setIsLoading(false);
    android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(getView(), R.string.offline_alert, Snackbar.LENGTH_SHORT);
    org.gdg.frisbee.android.view.ColoredSnackBar.alert(snackbar).show();
}