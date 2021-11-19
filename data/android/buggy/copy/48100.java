@java.lang.Override
public void showOnSuccess() {
    progressDialog.dismiss();
    tellh.com.gitclub.common.wrapper.Note.show(getString(R.string.success_loading));
    if (errorView.isShowing())
        errorView.hideErrorView(mainContent);
    
}