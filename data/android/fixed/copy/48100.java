@java.lang.Override
public void showOnSuccess() {
    progressDialog.dismiss();
    if (errorView.isShowing())
        errorView.hideErrorView(mainContent);
    
}