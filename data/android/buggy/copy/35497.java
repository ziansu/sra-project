public void setWifiList(java.util.ArrayList<com.gmail.ndraiman.wifipasswords.WifiEntry> listWifi) {
    this.listWifi = listWifi;
    notifyItemRangeChanged(0, listWifi.size());
}