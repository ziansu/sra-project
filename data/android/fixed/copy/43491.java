@java.lang.Override
public void run() {
    try {
        applyGlobalContent(true, false, view, activity);
        android.support.design.widget.Snackbar.make(view, "Updated!", Snackbar.LENGTH_SHORT).show();
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    }
}