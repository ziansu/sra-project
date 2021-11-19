public android.net.wifi.WifiConfiguration getWifiApConfiguration() {
    try {
        wifiApConfigurationMethod.setAccessible(true);
        return ((android.net.wifi.WifiConfiguration) (wifiApConfigurationMethod.invoke(mWifiManager, null)));
    } catch (java.lang.Exception e) {
        return null;
    }
}