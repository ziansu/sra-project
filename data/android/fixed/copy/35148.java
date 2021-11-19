protected int getErrorCode(final android.content.Intent response) {
    return response.getIntExtra(DConnectMessage.EXTRA_ERROR_CODE, DConnectMessage.ErrorCode.UNKNOWN.getCode());
}