@java.lang.Override
public void onSuccess(com.android.volley.NetworkResponse response) {
    mUi.showProgressBarLoading(true);
    mUi.onUnfollowSuccess();
}