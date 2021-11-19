@java.lang.Override
public void onError(java.lang.Exception ex) {
    android.support.design.widget.Snackbar.make(coordinatorLayout, ("Error: " + (ex.getMessage())), Snackbar.LENGTH_LONG).show();
}