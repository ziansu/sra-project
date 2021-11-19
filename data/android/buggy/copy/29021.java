@java.lang.Override
public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
    if (((loadingDialog) != null) && (loadingDialog.isShowing())) {
        loadingDialog.dismiss();
    }
    loadingDialog = new com.home77.common.ui.widget.LoadingDialog(activity);
}