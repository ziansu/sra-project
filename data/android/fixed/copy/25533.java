public void unregisterOnStatusChange(final android.content.Intent response) {
    mOnStatusChangeEventFlag = false;
    response.putExtra(DConnectMessage.EXTRA_RESULT, DConnectMessage.RESULT_OK);
    sendResponse(response);
}