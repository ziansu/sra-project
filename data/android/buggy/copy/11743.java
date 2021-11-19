@java.lang.Override
public void onClick(android.view.View view) {
    lb.loadingSuccessful();
    sucBtn.setEnabled(false);
    failedBtn.setEnabled(false);
    resetBtn.setEnabled(true);
}