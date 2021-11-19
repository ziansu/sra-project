@java.lang.Override
public void onLoginFailure(java.lang.String msg) {
    android.util.Log.d(com.curiosity.mycalendar.sysinfo.presenter.LoginPresenter.TAG, "onLoginFailure: ");
    mLoginView.showProgress(false);
    mLoginView.onLoginFailure();
    mLoginView.makeToast(msg);
}