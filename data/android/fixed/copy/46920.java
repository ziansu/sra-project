@java.lang.Override
public void onFailure(java.lang.Throwable throwable) {
    callback.onCreateCaseError(new com.desk.android.sdk.error.ErrorResponse(throwable));
}