public void unregisterOnStatusChange(final android.content.Intent response) {
    mOnStatusChangeEventFlag = false;
    response.putExtra(DConnectMessage.EXTRA_RESULT, DConnectMessage.RESULT_OK);
    response.putExtra(DConnectMessage.EXTRA_VALUE, "Unregister OnStatusChange event");
    sendResponse(response);
}