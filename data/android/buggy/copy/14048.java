public static int getDeviceNetwokActivity(android.content.Context context) {
    return ((com.cordova.ansensors.plugin.TelephonyManager) (mContext.getSystemService(Context.TELEPHONY_SERVICE))).listen(mPhoneStateListener, ((PhoneStateListener.LISTEN_DATA_CONNECTION_STATE) | (PhoneStateListener.LISTEN_DATA_ACTIVITY)));
}