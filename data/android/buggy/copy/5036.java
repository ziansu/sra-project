@java.lang.Override
public void onDestroy() {
    com.urbanairship.cordova.gimbal.GimbalAdapter.shared().stop();
    super.onDestroy();
    sendBroadcast(new android.content.Intent(com.urbanairship.cordova.gimbal.GimbalAdapterService.INTENT_START));
}