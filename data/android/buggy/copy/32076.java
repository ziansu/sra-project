public java.lang.String getDeviceId() {
    java.lang.String value = getString(R.string.pref_device_id, com.jana.android.core.utils.DeviceInfo.getUniqueId());
    return value;
}