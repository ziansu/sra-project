@java.lang.Override
public void showError() {
    ((by.grodno.toni7777.socialnetwork.ui.login.LoginViewState) (viewState)).setShowError();
    setViewsEnabled(true);
    mAuthorizationButton.setProgress(Constants.ACTION_BUTTON_START);
    mErrorView.setVisibility(android.view.View.VISIBLE);
}