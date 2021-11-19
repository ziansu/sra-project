public static android.support.design.widget.Snackbar getErrorSnackBar(java.lang.String message, android.view.View attachedView) {
    final android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(attachedView, message, Snackbar.LENGTH_LONG);
    return snackbar;
}