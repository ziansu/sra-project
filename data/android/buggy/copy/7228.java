public void saveCheckpointAsIncomplete(java.lang.String tableId, java.lang.String stringifiedJSON, java.lang.String rowId, java.lang.String callbackJSON, java.lang.String transId, java.lang.Boolean leaveTransactionOpen) {
    org.opendatakit.common.android.views.ExecutorRequest request = new org.opendatakit.common.android.views.ExecutorRequest(ExecutorRequestType.USER_TABLE_SAVE_CHECKPOINT_AS_INCOMPLETE, tableId, stringifiedJSON, rowId, callbackJSON, transId, leaveTransactionOpen);
    queueRequest(request);
}