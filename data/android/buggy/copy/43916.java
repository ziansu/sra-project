protected int getResult(final android.content.Intent response) {
    int result = response.getIntExtra(DConnectMessage.EXTRA_RESULT, DConnectMessage.RESULT_ERROR);
    return result;
}