@java.lang.Override
public void onError(int errorCode, @android.support.annotation.Nullable
java.lang.String errorMessage) {
    java.lang.String displayedError = (errorMessage == null) ? "" : errorMessage;
    showError(displayedError, ((mCustomerSessionProxy) == null));
    setCommunicatingProgress(false);
}