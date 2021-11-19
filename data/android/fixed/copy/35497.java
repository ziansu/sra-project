public void setWifiList(java.util.ArrayList<com.gmail.ndraiman.wifipasswords.WifiEntry> listWifi) {
    this.listWifi = listWifi;
    this.notifyItemRangeChanged(0, listWifi.size());
}