public void showZeroOffBanner(@android.support.annotation.NonNull
final android.app.Activity activity, java.lang.String message, int background, int foreground) {
    android.support.design.widget.Snackbar snackbar = org.wikipedia.util.FeedbackUtil.makeSnackbar(activity.getWindow().getDecorView(), message, FeedbackUtil.LENGTH_DEFAULT);
    show(snackbar, background, foreground);
}