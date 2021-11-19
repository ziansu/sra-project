@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((receiveDataService) != null) {
        if (intent.getAction().equals(ReceiveDataService.DATA_RECEIVED_ACTION)) {
            onReceivingData();
        }else {
        }
    }
}