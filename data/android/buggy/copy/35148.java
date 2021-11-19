protected int getErrorCode(final android.content.Intent response) {
    int errorCode = response.getIntExtra(DConnectMessage.EXTRA_ERROR_CODE, DConnectMessage.ErrorCode.UNKNOWN.getCode());
    return errorCode;
}