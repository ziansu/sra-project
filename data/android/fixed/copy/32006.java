@android.annotation.SuppressLint(value = "HardwareIds")
java.lang.String IMEI() {
    return ((android.telephony.TelephonyManager) (c.getSystemService(Context.TELEPHONY_SERVICE))).getDeviceId();
}