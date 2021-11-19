@java.lang.Override
public void onFail(java.lang.String errorMessage) {
    java.lang.String message = getString(R.string.register_success_but_profile_failed);
    super.onFail(message);
    mDialog.dismiss();
    registerSuccessButProfileFailed();
}