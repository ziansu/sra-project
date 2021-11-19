@java.lang.Override
public void onDismiss(android.content.DialogInterface dialogInterface) {
    if (!(navigateSuccess)) {
        funnel.logCancel();
    }
}