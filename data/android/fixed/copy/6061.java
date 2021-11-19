public void closeWifiAp() {
    if (isWifiApEnabled()) {
        setWifiApEnabled(getWifiApConfiguration(), false);
    }
}